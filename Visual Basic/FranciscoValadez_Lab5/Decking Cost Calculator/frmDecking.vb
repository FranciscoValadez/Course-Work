' Lab #5, Chapter 5, Decking Cost Calculator
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 10/31/2020
' Purpose:  This Windows application computes the estimated cost of decking based on the number 
'of swuare feet and the following cost per square foot: Lumber - $2.35 per square foot; Redwood - $7.75
'per square foot; Composite - $8.50 per square foot

Option Strict On
Public Class frmDecking
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'When the user clicks the calculate button This procedure calculates the estimated cost of decking

        Dim decFootage As Decimal
        Dim decCostPerSquareFoot As Decimal
        Dim decCostEstimate As Decimal
        Dim decLumberCost As Decimal = 2.35D
        Dim decRedwoodCost As Decimal = 7.75D
        Dim decCompositeCost As Decimal = 8.5D

        'Checks if the user entered a number
        If IsNumeric(txtFootage.Text) Then
            decFootage = Convert.ToDecimal(txtFootage.Text)
            ' Checks if the number the user entered is positive
            If decFootage > 0 Then

                'Checks what radiobutton the user selected
                If radLumber.Checked Then
                    decCostPerSquareFoot = decLumberCost
                ElseIf radRedWood.Checked Then
                    decCostPerSquareFoot = decRedwoodCost
                ElseIf radComposite.Checked Then
                    decCostPerSquareFoot = decCompositeCost
                End If

                'Calculates and displays the Estimate
                decCostEstimate = decFootage * decCostPerSquareFoot
                lblCostEstimate.Text = decCostEstimate.ToString("C")
            Else
                'Displays Error message if the user entered a number less than 0

                MsgBox("You entered " & decFootage.ToString() & ". Enter a Positive Number",, "Input Error")
                'Sets the focus to the text box and resets what was entered into the text box
                txtFootage.Text = ""
                txtFootage.Focus()
            End If

        Else
            'Displays an error message if the user entered a nonnumeric value
            MsgBox("Enter the Square Footage of the Decking.",, "Input Error")
            'Sets the focus to the text box and resets what was entered into the text box
            txtFootage.Text = ""
            txtFootage.Focus()
        End If
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles txtFootage.TextChanged

    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'This procedure activates when the user clicks the clear button. The textbox is reset, the insertion poin
        'is set to the text box, and the cost label is cleared

        txtFootage.Clear()
        txtFootage.Focus()
        lblCostEstimate.Text = ""
        radLumber.Checked = True
        radComposite.Checked = False
        radRedWood.Checked = False
    End Sub

    Private Sub frmDecking_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'This procedure is executed when the form is loaded, it clears the cost estimate label and sets the
        ' insertion point on the text box

        txtFootage.Focus()
        lblCostEstimate.Text = ""

    End Sub
End Class
