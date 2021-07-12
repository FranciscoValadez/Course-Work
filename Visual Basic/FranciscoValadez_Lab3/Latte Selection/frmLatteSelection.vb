'   Program Name:   Latte Selection
'   Developer:      Francisco Valadez
'   Date:           September 25, 2020
'   Purpose         This application displays two latte flavors (pumpkin spice
'                   and mocha.) The user can select a latte flavor.
Public Class Form1
    Private Sub lblHeading_Click(sender As Object, e As EventArgs) Handles lblHeading.Click

    End Sub

    Private Sub btnPumpkin_Click(sender As Object, e As EventArgs) Handles btnPumpkin.Click
        ' This code is executed when the user clicks the pumpkin spice button
        ' It makes the pumpkin picture visible, hides the mocha picture, enables the select latte button

        picPumpkin.Visible = True   ' Makes Pumkin Picture visible
        picMocha.Visible = False    ' Makes Mocha picture invisible
        btnSelect.Enabled = True    ' Enables Select Button

    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        '   This code is executed when the user clicks the Exit window button
        '   The program is terminated and the program's window is closed

        Close()

    End Sub

    Private Sub btnMocha_Click(sender As Object, e As EventArgs) Handles btnMocha.Click
        'This code is executed when the user clicks on the mocha button
        'It makes the mocha picture visible, the pumpkin picture invisible and enables the select button 

        picMocha.Visible = True
        picPumpkin.Visible = False
        btnSelect.Enabled = True

    End Sub

    Private Sub btnSelect_Click(sender As Object, e As EventArgs) Handles btnSelect.Click
        'This code is executed when the user clicks the Select Latte button
        'It disbables the pumpkin spice button, the select latte button and the mocha button.
        'It hides the Instruction label and displays the confirmation message label and enables the Exit Window Button

        btnPumpkin.Enabled = False
        btnMocha.Enabled = False
        btnSelect.Enabled = False
        lblInstructions.Visible = False
        lblConfirmation.Visible = True
        btnExit.Enabled = True

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
