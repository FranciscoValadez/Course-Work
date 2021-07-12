'Midterm Exam
'Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
'10/24/2020

Public Class Form1

    'This is the Value for the cost Per Gallon
    Const _cCostPerGallon As Decimal = 6D

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'This procedure loses the window and terminates the program when the Exit button is clicked
        Close()
    End Sub

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'This procedure is activated when the user clics the calculate button, the total cost and 
        'total gallons used is displayed

        'Declaration of Variables
        Dim strHandsGallons As String
        Dim strBathGallons As String
        Dim decHandsG As Decimal
        Dim decBathG As Decimal
        Dim decTotalCost As Decimal
        Dim decTotalGallons As Decimal

        'Below Grabs the users input
        strHandsGallons = txtHandsGallons.Text
        strBathGallons = txtBathingGallons.Text

        'Below converts from string to decimal so we could use it in the equation
        decHandsG = Convert.ToDecimal(strHandsGallons)
        decBathG = Convert.ToDecimal(strBathGallons)

        'Below Calculates the total Gallons Used
        decTotalGallons = (decHandsG * 1.5) + (decBathG * 5)
        'Below Calculates the total Cost
        decTotalCost = decTotalGallons * _cCostPerGallon

        'Below sends the the data back to the UI so that the user can see what the total gallons used
        ' and the total cost
        lblTotalCost.Text = decTotalCost.ToString("C")
        lblTotalGallons.Text = decTotalGallons.ToString("F")

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'This procedure Clears the Text box and labels at launch
        txtBathingGallons.Clear()
        txtHandsGallons.Clear()
        lblTotalCost.Text = ""
        lblTotalGallons.Text = ""

        'On launch will set the insertion point to the Hands Gallons text box
        txtHandsGallons.Focus()
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'This procedure clears the text box and labels when the clear button is clicked
        txtBathingGallons.Clear()
        txtHandsGallons.Clear()
        lblTotalCost.Text = ""
        lblTotalGallons.Text = ""
        'The inserstion poin is set back at the text box
        txtHandsGallons.Focus()
    End Sub
End Class
