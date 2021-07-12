' Lab #8, Chapter 8, Depreciation
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 12/19/2020
'This Windows application opens an inventory data file and computes the 
'item depreciation based On the information given

Option Strict On

Public Class frmDepreciation
    'Class level Private variables
    Private _intLifeOfItems As Integer = 5
    Public Shared _intSizeOfArray As Integer = 7
    Public Shared _strInventoryItem(_intSizeOfArray) As String
    Private _strItemId(_intSizeOfArray) As String
    Private _decInitialPrice(_intSizeOfArray) As Decimal
    Private _intQuantity(_intSizeOfArray) As Integer

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'The form load event reads the inventory text file and
        'fills the Listbox object with the inventory items

        'Initialize an instance of the StreamReader object and declare variables
        Dim objReader As IO.StreamReader
        Dim strLocationAndNameOfFile As String = "d:\inventory.txt"
        Dim intCount As Integer = 0
        Dim intFill As Integer
        Dim strFileError As String = "The file is not available. Restart when the file is available"

        'Verify the file exists
        If IO.File.Exists(strLocationAndNameOfFile) Then
            objReader = IO.File.OpenText(strLocationAndNameOfFile)
            'Read the file line by line until the file is complete
            Do While objReader.Peek <> -1
                _strInventoryItem(intCount) = objReader.ReadLine()
                _strItemId(intCount) = objReader.ReadLine()
                _decInitialPrice(intCount) = Convert.ToDecimal(objReader.ReadLine())
                _intQuantity(intCount) = Convert.ToInt32(objReader.ReadLine())
                intCount += 1
            Loop
            objReader.Close()

            'The listbox object is filled with the inventory IDs
            For intFill = 0 To (_strItemId.Length - 1)
                lstInventoryId.Items.Add(_strItemId(intFill))
            Next
        Else
            MsgBox(strFileError, , "Error")
            Close()
        End If
    End Sub

    Private Sub btnCalculateDepreciation_Click(sender As Object, e As EventArgs) Handles btnCalculateDepreciation.Click
        'This button click event calls the depreciation sub procedure
        'Declaration of variables
        Dim intSelectedItemId As Integer
        Dim strMissingSelection As String = "Missing Selection"
        Dim strSelectDepreciationError As String = "Select a Depreciation Method"
        Dim strSelectInventoryItemIDError As String = "Select an Inventory Item ID"

        'if the listbox and a depreciation radiobutton object are selected,
        'call the depreciation procedure
        If lstInventoryId.SelectedIndex >= 0 Then
            intSelectedItemId = lstInventoryId.SelectedIndex
            If radStraightLine.Checked Then
                StraightLineDepreciation(intSelectedItemId)
            ElseIf radDoubleDeclining.Checked Then
                DoubleDecliningDepreciation(intSelectedItemId)
            Else
                MsgBox(strSelectDepreciationError, , strMissingSelection)
            End If
        Else
            MsgBox(strSelectInventoryItemIDError, , strMissingSelection)
        End If
    End Sub

    Private Sub StraightLineDepreciation(ByVal intItemId As Integer)
        'This sub procedure computes and displays the straight line depreciation for the item selected
        'Declaration of variables
        Dim intStraightPresentYear As Integer
        Dim decStraightPresentYearValue As Decimal = 0
        Dim decStraightDepreciation As Decimal
        Dim decStraightTotal As Decimal
        Dim strDepreciationItem As String = "The depreciation of the item: "
        Dim strQuantityMessage As String = "Quantity: "

        'The procedure MakeObjectVisible is called to display the Form objects
        MakeObjectsVisible()
        'Display the item ad quantity of the selected item
        lblItem.Text = strDepreciationItem & _strInventoryItem(intItemId)
        lblQuantity.Text = strQuantityMessage & _intQuantity(intItemId).ToString()
        'The formula for striaght-line depreciation
        decStraightDepreciation = _decInitialPrice(intItemId) / _intLifeOfItems
        decStraightPresentYearValue = _decInitialPrice(intItemId)

        'The loop repeats for the life of the items
        For intStraightPresentYear = 1 To _intLifeOfItems
            'Accumaltes the total of depreciation
            decStraightTotal += decStraightDepreciation
            'Displays the depreciation amounts
            lstYear.Items.Add(intStraightPresentYear.ToString())
            lstPresentValue.Items.Add(decStraightPresentYearValue.ToString("C"))
            lstYearDepreciation.Items.Add(decStraightDepreciation.ToString("C"))
            lstTotalDepreciation.Items.Add(decStraightTotal.ToString("C"))
            decStraightPresentYearValue -= decStraightDepreciation
        Next
    End Sub

    Private Sub DoubleDecliningDepreciation(ByVal intItemID As Integer)
        'This sub procedure computes and displays the double declining
        'balance depreciation for the item selected
        Dim intDoublePresentYear As Integer
        Dim decDoublePresentYearValue As Decimal = 0
        Dim decDoubleDepreciation As Decimal
        Dim decDoubleTotal As Decimal

        'the procedure MakeObjectVisible is called to display the form objects
        MakeObjectsVisible()
        'Display the item and quantity of the selected item
        lblItem.Text = "The depreciation of the item: " & _strInventoryItem(intItemID)
        lblQuantity.Text = "Quantity: " & _intQuantity(intItemID).ToString()
        decDoublePresentYearValue = _decInitialPrice(intItemID)

        'The loop repeats for the life of the items
        For intDoublePresentYear = 1 To _intLifeOfItems
            'the formula for the double declining depreciation inside the loop to repeat the process
            decDoubleDepreciation = (decDoublePresentYearValue * 2D) / _intLifeOfItems
            'Accumulates the total of depreciation
            decDoubleTotal += decDoubleDepreciation
            'Displays the depreciation amounts
            lstYear.Items.Add(intDoublePresentYear.ToString())
            lstPresentValue.Items.Add(decDoublePresentYearValue.ToString("C"))
            lstYearDepreciation.Items.Add(decDoubleDepreciation.ToString("C"))
            lstTotalDepreciation.Items.Add(decDoubleTotal.ToString("C"))
            decDoublePresentYearValue -= decDoubleDepreciation
        Next
    End Sub
    Private Sub MakeObjectsVisible()
        'This procedure displays the objects showing the resulsts
        lblItem.Visible = True
        lblQuantity.Visible = True
        lblPresentYear.Visible = True
        lstYear.Visible = True
        lblPresentValue.Visible = True
        lstPresentValue.Visible = True
        lblYearDepreciation.Visible = True
        lstYearDepreciation.Visible = True
        lblTotalDepreciation.Visible = True
        lstTotalDepreciation.Visible = True
        'The precious date is removed
        lstYear.Items.Clear()
        lstPresentValue.Items.Clear()
        lstYearDepreciation.Items.Clear()
        lstTotalDepreciation.Items.Clear()
    End Sub

    Private Sub mnuDisplay_Click(sender As Object, e As EventArgs) Handles mnuDisplay.Click
        'The menuDisplay click event creates an instance of the frmDisplayInventory
        Dim frmSecond As New frmInventory

        'Hides this form and shows the display inventory form
        Hide()
        frmSecond.ShowDialog()
    End Sub

    Private Sub mnuClear_Click(sender As Object, e As EventArgs) Handles mnuClear.Click
        'This event clears and resets the form
        lstInventoryId.SelectedIndex = -1
        radStraightLine.Checked = False
        radDoubleDeclining.Checked = False
        lblItem.Visible = False
        lblQuantity.Visible = False
        lblPresentYear.Visible = False
        lstYear.Visible = False
        lblPresentValue.Visible = False
        lstPresentValue.Visible = False
        lblYearDepreciation.Visible = False
        lstYearDepreciation.Visible = False
        lblTotalDepreciation.Visible = False
        lstTotalDepreciation.Visible = False
        lstYear.Items.Clear()
        lstPresentValue.Items.Clear()
        lstYearDepreciation.Items.Clear()
        lstTotalDepreciation.Items.Clear()
    End Sub

    Private Sub mnuExit_Click(sender As Object, e As EventArgs) Handles mnuExit.Click
        'Closes the application
        Application.Exit()
    End Sub
End Class
