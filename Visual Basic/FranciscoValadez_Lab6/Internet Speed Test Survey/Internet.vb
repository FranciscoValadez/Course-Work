' Lab #6, Chapter 6, Internet Speed Test Survey
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 11/17/2020
'This Windows application computes and displays both the average internet speed and the values a user inputs

Option Strict On
Public Class Internet
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'This code will execute when the user clicks the Calculate Speed button. It will dispaly the data inputed
        'by the user into the listbox and will also show the average speed at the bottom of the screen

        Dim intEnteriesMax As Integer = 10
        Dim intEnteriesCount As Integer = 1
        Dim decSpeed As Decimal
        Dim decAverageSpeed As Decimal
        'Decimal Below is Zero in order to add the total
        Dim decTotalSpeed As Decimal = 0D
        'The string below will be overwritten if there an error message needs to be displayed
        Dim strInputMessage As String = "Please input the speed for test # "
        Dim strNormalMessage As String = "Please input the speed for test # "
        Dim strInputHeading As String = "Speed Test"
        Dim strErrorNonNumeric As String = "Error - A nonnumeric Value was entered for test # "
        Dim strErrorNegative As String = "Error - A negative number was entered for test # "
        'The string below helps check if the user clicks the cancel button and prevents the value from being 'null'
        Dim strCancelClicked As String = ""
        Dim strSpeed As String


        'This input box appears at first outside of the loop in case the user wants to cancel out of the input box
        'or if the dont want to put any data
        strSpeed = InputBox(strNormalMessage & intEnteriesCount, strInputHeading, "")

        'The while loop below continue to exicut until 10 values are input or until the user cancels inputtting more data
        'The loop will not execute if the user had pressed when the above input box was executed

        Do Until intEnteriesCount > intEnteriesMax Or strSpeed = strCancelClicked

            'Checks if the value input is numeric, if not it gives the user an error message
            If IsNumeric(strSpeed) Then
                'Converts the string variable from the input box into a decimal
                decSpeed = Convert.ToDecimal(strSpeed)
                'checks if the value is a positive number if not it gives the user an error message
                If decSpeed >= 0 Then
                    lstSpeed.Items.Add(decSpeed)
                    decTotalSpeed += decSpeed
                    'Ups the counter
                    intEnteriesCount += 1
                    strInputMessage = strNormalMessage
                Else
                    strInputMessage = strErrorNegative
                End If

            Else
                strInputMessage = strErrorNonNumeric

            End If

            'Checks if the amount of times the enteries is still below the max if it is the loop restarts, if not the loop ends
            If intEnteriesCount <= intEnteriesMax Then
                strSpeed = InputBox(strInputMessage & intEnteriesCount, strInputHeading, "")
            End If
        Loop

        'Calculates the Average speed
        If intEnteriesCount > 1 Then
            decAverageSpeed = decTotalSpeed / (intEnteriesCount - 1)
            lblAverage.Text = "Average speed is " & decAverageSpeed.ToString("F2") & " Mbps!"
            lblAverage.Visible = True
        Else
            'gives an error message if no value was entered or if the user presses the cancel button
            MsgBox("No weight loss value was entered", MsgBoxStyle.Exclamation, "Error")
        End If

        'Disables the Calculate speed button
        btnCalculate.Enabled = False

    End Sub
End Class
