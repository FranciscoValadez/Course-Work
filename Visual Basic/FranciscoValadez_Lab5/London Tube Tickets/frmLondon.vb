' Lab #5, Chapter 5, London Tube Tickets
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 10/31/2020
'This Windows application computs the Cost of tickets depending on the zone selected and the amount of
'tickests purchased, and converts the cost from Euros to USD


Public Class frmLondon

    'The rate of of conversion from Euros to US Dollars
    Const _cRateOfConversion As Decimal = 1.16769D

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click

        lblTotalCost.Text = ""
        txtTickets.Clear()
        txtTickets.Focus()
        radZOneThree.Checked = True
        radZOneSix.Checked = False
        radZOneFive.Checked = False
    End Sub

    Private Sub frmLondon_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'When the form is loaded the insertion point is set to the text box and the total cost label is
        'blanked out

        txtTickets.Focus()
        lblTotalCost.Text = ""
    End Sub

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'This procedure calculates the total cost of the ticket(s), converts it from Euros to USD and displays
        'the results to the user

        Dim decAmountofTickets As Decimal
        Dim decFareCost As Decimal
        Dim decTotalCost As Decimal
        Dim decZoneOneThree As Decimal = 4.9D
        Dim decZoneOneFive As Decimal = 5.9D
        Dim decZoneOneSix As Decimal = 6D

        'Checks if the user entered a number
        If IsNumeric(txtTickets.Text) Then
            decAmountofTickets = Convert.ToDecimal(txtTickets.Text)

            ' Checks if the number the user entered is positive
            If decAmountofTickets > 0 Then
                'Checks what radiobutton the user selected
                If radZOneThree.Checked Then
                    decFareCost = decZoneOneThree
                ElseIf radZOneFive.Checked Then
                    decFareCost = decZoneOneFive
                ElseIf radZOneSix.Checked Then
                    decFareCost = decZoneOneSix
                End If

                'Calculates and displays the total Ticket cost
                decTotalCost = (decAmountofTickets * decFareCost) * _cRateOfConversion
                lblTotalCost.Text = decTotalCost.ToString("C")
            Else
                'Displays Error message if the user entered a number less than 0

                MsgBox("You entered " & decAmountofTickets.ToString() & ". Enter a Positive Number",, "Input Error")
                'Sets the focus to the text box and resets what was entered into the text box
                txtTickets.Text = ""
                txtTickets.Focus()
            End If

        Else
            'Displays an error message if the user entered a nonnumeric value
            MsgBox("Enter the the amount of tickets.",, "Input Error")
            'Sets the focus to the text box and resets what was entered into the text box
            txtTickets.Text = ""
            txtTickets.Focus()

        End If


    End Sub
End Class
