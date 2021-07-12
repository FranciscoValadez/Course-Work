' Lab #7, Chapter 7, Karaoke Music Night
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 12/19/2020
'This Windows application lets users see the cost of renting a Karaoke Room either hourly or by song

Option Strict On
Public Class frmKaraoke

    Private Sub cmbChoice_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cmbChoice.SelectedIndexChanged
        'The code below runs when the user makes 1 of 2 selections in the combobox

        If cmbChoice.SelectedIndex = 0 Then

            MakeItemsVisible()
            lblSelection.Text = "Please input the hours to rent:"

        End If
        If cmbChoice.SelectedIndex = 1 Then

            MakeItemsVisible()
            lblSelection.Text = "Please input the number of songs:"

        End If

        'Clears the textbox and other labels
        txtAmount.Text = ""
        lblCost.Text = ""
        txtAmount.Focus()

    End Sub

    Private Function ValidateNumber() As Boolean
        'This procedure validates the value entered for the text box

        Dim intAmount As Integer
        Dim blnValidityCheck As Boolean = False
        Dim strNumberInTeamMessage As String = "Please enter a positive integer"
        Dim strMessageBoxTitle As String = "Error"

        Try
            intAmount = Convert.ToInt32(txtAmount.Text)
            If intAmount >= 1 Then
                blnValidityCheck = True
            Else
                MsgBox(strNumberInTeamMessage, , strMessageBoxTitle)
                txtAmount.Focus()
                lblCost.Text = ""
                txtAmount.Clear()
            End If
        Catch Exception As FormatException
            MsgBox(strNumberInTeamMessage, , strMessageBoxTitle)
            txtAmount.Focus()
            lblCost.Text = ""
            txtAmount.Clear()
        Catch Exception As OverflowException
            MsgBox(strNumberInTeamMessage, , strMessageBoxTitle)
            txtAmount.Focus()
            lblCost.Text = ""
            txtAmount.Clear()
        Catch exception As SystemException
            MsgBox(strNumberInTeamMessage, , strMessageBoxTitle)
            txtAmount.Focus()
            lblCost.Text = ""
            txtAmount.Clear()
        End Try
        Return blnValidityCheck
    End Function

    Private Sub btnTotal_Click(sender As Object, e As EventArgs) Handles btnTotal.Click
        'The code below is executed when the total button is clicked

        Dim dblTotal As Double
        Dim blnNumberValid As Boolean = False

        blnNumberValid = ValidateNumber()
        If blnNumberValid Then
            If cmbChoice.SelectedIndex = 0 Then
                'Calculates the Total
                dblTotal = Convert.ToInt32(txtAmount.Text) * 8.99

            End If
            If cmbChoice.SelectedIndex = 1 Then
                'Calculates the total
                dblTotal = Convert.ToInt32(txtAmount.Text) * 2.99

            End If

            'Displays the total
            lblCost.Text = "Total Cost: " + dblTotal.ToString("C")
        End If

    End Sub

    Private Sub MakeItemsVisible()
        'makes the following items visible when the function is called:
        lblCost.Visible = True
        lblSelection.Visible = True
        txtAmount.Visible = True
        btnClear.Visible = True
        btnTotal.Visible = True
    End Sub

    Private Sub HideItems()
        'makes the following items visible when the function is called:
        lblCost.Visible = False
        lblSelection.Visible = False
        txtAmount.Visible = False
        btnClear.Visible = False
        btnTotal.Visible = False
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'Clears the form when the button clear is clicked

        'Hides the items
        HideItems()

        'Clears the textbox and other labels
        txtAmount.Text = ""
        lblCost.Text = ""
        lblSelection.Text = ""

    End Sub

    Private Sub frmKaraoke_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'On loading the form a splash screen is shown and text is cleared
        'Holds the splash scren for 5 seconds
        Threading.Thread.Sleep(1000)

        'Clears the textbox and other labels
        txtAmount.Text = ""
        lblCost.Text = ""
        lblSelection.Text = ""
    End Sub
End Class
