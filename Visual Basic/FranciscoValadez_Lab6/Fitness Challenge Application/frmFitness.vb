' Lab #6, Chapter 6, Fitness Challenge
' Francisco Valadez, 883405520
' CoSci 208, Sec. 25188/25189
' 11/17/2020
'This Windows application computes and displays the total average weight loss, and each weight loss value

Option Strict On
Public Class frmFitness

    Private Sub btnWeightLoss_Click(sender As Object, e As EventArgs) Handles btnWeightLoss.Click

        'Declaration of variables
        Dim strWeightLoss As String
        Dim decWeightLoss As Decimal
        Dim decAverageLoss As Decimal
        Dim decTotalWeightLoss As Decimal = 0D
        Dim strInputMessage As String = "Enter the weight loss for Team Member #"
        Dim strinputHeading As String = "Weight Loss"
        Dim strNormalMessage As String = "Enter the weight loss for Team Member #"
        Dim strNonNumbericError As String = "Error - Enter a number for the weight loss of team meber #"
        Dim strNegativeError As String = "Error - Enter a positive number for the weight loss of team member #"

        'Declarization of Loop variables
        Dim strCancelClicked As String = ""
        Dim intMaxNumberOfEntries As Integer = 8
        Dim intNumberofEntries As Integer = 1

        'This loop allows the user to enter the weight loss of up to 8 team members.
        'The loop terminates when the user has entered 8 weight loss values or if the user
        'clicks the Cancel button or the Close button in the inputbox
        strWeightLoss = InputBox(strInputMessage & intMaxNumberOfEntries, strinputHeading, "")

        Do Until intNumberofEntries > intMaxNumberOfEntries Or strWeightLoss = strCancelClicked
            'Checks if the value is Numeric, if not gives the user an error message
            If IsNumeric(strWeightLoss) Then
                decWeightLoss = Convert.ToDecimal(strWeightLoss)
                'Checks if the value is not a negative number
                If decWeightLoss > 0 Then
                    lstWeightLoss.Items.Add(decWeightLoss)
                    decTotalWeightLoss += decWeightLoss
                    intNumberofEntries += 1
                    strInputMessage = strNormalMessage
                Else
                    strInputMessage = strNegativeError
                End If
            Else
                strInputMessage = strNonNumbericError
            End If
            'Checks if the amount of times the enteries is still below the max, if not the loop ends
            If intNumberofEntries <= intMaxNumberOfEntries Then
                strWeightLoss = InputBox(strInputMessage & intNumberofEntries, strinputHeading, "")
            End If
        Loop

        'Calculates and displays average team weight loss
        If intNumberofEntries > 1 Then
            lblAverageLoss.Visible = True
            decAverageLoss = decTotalWeightLoss / (intNumberofEntries - 1)
            lblAverageLoss.Text = "Average weight loss is " & decAverageLoss.ToString("F1") & " lbs"
        Else
            MsgBox("No weight loss value entered.")
        End If

        'Disables the weight loss button
        btnWeightLoss.Enabled = False
    End Sub

    Private Sub mnuClear_Click(sender As Object, e As EventArgs) Handles mnuClear.Click
        'The mnuClear click event clears the ListBox object and hides the average weight loss label.
        'It also enables the Weight Loss button

        lstWeightLoss.Items.Clear()
        lblAverageLoss.Visible = False
        btnWeightLoss.Enabled = True

    End Sub

    Private Sub mnuExit_Click(sender As Object, e As EventArgs) Handles mnuExit.Click
        'The mnuExit click event closes the window and exits the application

        Close()

    End Sub
End Class
