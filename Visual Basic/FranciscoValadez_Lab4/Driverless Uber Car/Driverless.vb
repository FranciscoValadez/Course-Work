' Lab #4, Chapter 4, Project Driverless Uber Car
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 10/5/2020

Option Strict On

Public Class Driverless

    Const _cCostPerMile As Decimal = 1.8D
    Const _cFlatRate As Decimal = 2.8D

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'This procedure is exectuded when the user clicks on the Exit button. The window
        'is closed and the program is terminated

        Close()     'Calls the close procedure, terminates the program and closes the window

    End Sub

    Private Sub btnFare_Click(sender As Object, e As EventArgs) Handles btnFare.Click
        'This procedure is exectued when the user clicks on the Display Fare button
        'The program grabs what the user has input and convertst the information so that we can use it to
        'calculate the total fare and then sends it back so the user can see the total

        'Declaraion of Varialbes:

        Dim strMilesInput As String
        Dim decMiles As Decimal
        Dim decTotal As Decimal

        strMilesInput = txtMiles.Text               'Grabs the users input and places it into the string strMilesInput
        decMiles = Convert.ToDecimal(strMilesInput)   'Converts the string into an integer

        decTotal = ((_cCostPerMile * decMiles) + _cFlatRate)    'Calculates the total fare
        lblTotalCost.Text = decTotal.ToString("C")              'Makes the cost visible to the user

    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'This procedure is executed when the user clicks on the Clear button. The textbox, and total are cleared
        'and the insertion point is placed back into the text box

        txtMiles.Clear()        'Clears the text box
        txtMiles.Focus()        'Puts the insertion point in the textbox
        lblTotalCost.Text = ""  'Empties the Total cost entry
    End Sub

    Private Sub Driverless_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'This procedure is exectued when the program is launced. It clears the variables in the text box
        'clears the total cost and sets the insertion at the text box

        lblTotalCost.Text = ""      'Empties the total cost label
        txtMiles.Clear()            'Empties the text box
        txtMiles.Focus()            'Sets the insertion point in the text box
    End Sub
End Class
