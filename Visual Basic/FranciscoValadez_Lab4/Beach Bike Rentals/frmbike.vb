' Lab #4, Chapter 4, Project Beach Bike Rentals
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 10/2/2020

Option Strict On

Public Class frmbike

    '   This variable is a constant and contains the total cost per day to rent a bike
    '   This constant will be able to be accessed by other procedures
    Const _cdecPricePerDay As Decimal = 9.95D

    Private Sub btnCost_Click(sender As Object, e As EventArgs) Handles btnCost.Click

        '   This procedure contains code that is executed when the user clicks on the 'Find Cost' button or when the user presses the enter button
        '   It calculates and displays the cost of the rented bike

        Dim strNumberofDays As String           '   Defines strNumberofDays as a string variable
        Dim intNumberofDays As Int32            '   Defines intNumberofDays as a integer variable
        Dim decTotalCost As Decimal             '   Defines decTotalCost as a decimal variable

        strNumberofDays = txtNumberofDays.Text              '   Makes strNumberofDays have the same value as what is in the textbox object
        intNumberofDays = Convert.ToInt32(strNumberofDays)  '   Converts the string Number of Days to an integer

        decTotalCost = intNumberofDays * _cdecPricePerDay   '   Calculates the Total cost by mutiplying the number of days by the constant price
        lblTotalCost.Text = decTotalCost.ToString("C")      '   Changes the lblTotalCost which is visible to the user so they could see the total cost for renting


    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'This code is executed when the user clicks on the 'Clear' button. The number of days text box is cleared and the total cost
        'is cleared as well. The insertion point is then moved to the number of days text box

        txtNumberofDays.Clear()     'Clears the NumberofDays text box
        lblTotalCost.Text = ""      'Clears the lblTotalCost so that it wont show the old total
        txtNumberofDays.Focus()     'Moves the insertion point to the txtNumberofDays textbox

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'This code is executed when the user clicks on the Exit button. It terminates the program and
        'closes teh window

        Close()     'Terminates the program, closes the window

    End Sub

    Private Sub frmbike_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'This code is executed when the program is first opened. It will show the user the cost per day of rental, and will clear
        'the total cost label and will set the insertion point to the NumberofDays textbox

        lblCostHeading.Text = _cdecPricePerDay.ToString("C") & " per Day"    'Concatentation of the constant price and a string to display price per day
        lblTotalCost.Text = ""      'The TotalCost label is wiped so that the user wont see a price when the program is first launched
        txtNumberofDays.Focus()     'The insertion point is moved to the txtNumberofDays text box

    End Sub
End Class
