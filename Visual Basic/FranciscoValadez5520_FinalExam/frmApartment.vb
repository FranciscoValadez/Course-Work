'Final Exam, Apartment Rental by City
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 12/18/2020
'This Windows application opens an txt file and shows the user the cost of rent for 10 cities
' as well as the average

Option Strict On
Public Class frmApartment

    'Class level Private variables
    Public Shared _intSizeOfArray As Integer = 10
    'Both arrays below are made public so frmCities can access them
    Public Shared _city(_intSizeOfArray) As String
    Public Shared _median(_intSizeOfArray) As String
    Private _strMedianMessage As String = "The median price for "

    Private Sub frmApartment_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'The form load event reads the inventory text file and
        'fills the Listbox object with the inventory items

        'Initialize an instance of the StreamReader object and declare variables
        Dim objReader As IO.StreamReader
        Dim strLocationAndNameOfFile As String = "d:\rentals.txt"
        Dim intCount As Integer = 0
        Dim intFill As Integer
        Dim strFileError As String = "Make sure the file rentals.txt is located at the root of drive 'd:\'" & vbCrLf & "Restart when the file is available"

        'Verify the file exists
        If IO.File.Exists(strLocationAndNameOfFile) Then
            objReader = IO.File.OpenText(strLocationAndNameOfFile)

            'The loop below reads the file line by line  until the file is complete
            Do While objReader.Peek <> -1
                _city(intCount) = objReader.ReadLine()
                _median(intCount) = objReader.ReadLine()

                intCount += 1
            Loop
            objReader.Close()

            'The listbox object is filled with the cities
            For intFill = 0 To 9
                lstCity.Items.Add(_city(intFill))
            Next

        Else
            'Error Displayed if the file is not found in the form of a message box
            MsgBox(strFileError, , "Error! File not found")
            Close()
        End If
    End Sub

    Private Sub DisplayTopTenCitiesToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles mnuDispalyCities.Click
        'When the user clicks this menu item, it creates an instance fo the frmCities and hides the frmApratment

        Dim frmCities As New frmCities

        'Hides the frmApartment
        Hide()
        'Shows the frmCities
        frmCities.ShowDialog()

    End Sub

    Private Sub mnuExit_Click(sender As Object, e As EventArgs) Handles mnuExit.Click
        'Terminates the application
        Application.Exit()
    End Sub

    Private Sub btnCompute_Click(sender As Object, e As EventArgs) Handles btnCompute.Click
        'When the user clicks btnCompute the Average is displayed in lblAverage

        lblAverage.Visible = True
        Total()

    End Sub

    Private Sub lstCity_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstCity.SelectedIndexChanged
        'When the user clicks on one of the items from the list box, the median price will be shown

        'if a listbox item is selected then the lblMedian is update to reflect the median price
        If lstCity.SelectedIndex >= 0 Then
            lblMedian.Visible = True
            lblMedian.Text = _strMedianMessage + lstCity.SelectedItem.ToString + " is " + (Convert.ToInt32(_median(lstCity.SelectedIndex))).ToString("C")
        End If

    End Sub

    Private Sub mnuClear_Click(sender As Object, e As EventArgs) Handles mnuClear.Click
        'When mnuClear is selected the following changes are made in order to clear the form from previous actions:

        lblAverage.Visible = False
        lblAverage.Text = ""
        lblMedian.Visible = False
        lblMedian.Text = ""
        lstCity.SelectedItem = False
    End Sub

    Private Sub Total()
        'This subprocedure calculates the total then sends the total to another sub procedure so 
        'that the average can be calculated

        Dim intTotal As Integer = 0

        'converts the string array to integers then adds upp all 10 integers
        For index = 0 To 9
            If _median(index) <> "" Then

                intTotal += Convert.ToInt32(_median(index))

            End If
        Next

        Average(intTotal)

    End Sub

    Private Sub Average(ByVal inTotal As Integer)
        'This sub procedure computes the average
        Dim dblAverage As Double

        dblAverage = Convert.ToDouble(inTotal) / Convert.ToDouble(_intSizeOfArray)

        lblAverage.Text = "Average Rental Cost for these 10 Cities is " + dblAverage.ToString("C")
    End Sub

End Class
