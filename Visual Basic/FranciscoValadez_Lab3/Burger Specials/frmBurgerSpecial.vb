'   Program Name:   Burger Special
'   Developer:      Francisco Valadez
'   Date:           September 25, 2020
'   Purpose:        This appilication displays the burger specials for a restaurant named Farm Burger.
'                   The user can select one of two specials: Prime Beef or Veggie.
Public Class frmBurgerSpecial
    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles lblHeading.Click

    End Sub

    Private Sub btnPrimeBeef_Click(sender As Object, e As EventArgs) Handles btnPrimeBeef.Click
        'This code is actived when the user clicks the Prime Beef button
        'It makse the prime beef picture visible, the veggie pic invisible and enables the Select Meal button

        picPrimeBeef.Visible = True
        picVeggie.Visible = False
        btnSelectMeal.Enabled = True

    End Sub

    Private Sub btnVeggie_Click(sender As Object, e As EventArgs) Handles btnVeggie.Click
        'This code is activated when the user clicks on the Veggie button
        'It makes the veggie picture visible, the prime beef picture invisible and enables the Select Meal button

        picVeggie.Visible = True
        picPrimeBeef.Visible = False
        btnSelectMeal.Enabled = True

    End Sub

    Private Sub btnSelectMeal_Click(sender As Object, e As EventArgs) Handles btnSelectMeal.Click
        'This code is activated when the user clicks the Select Meal button
        'It disables the prime beef button, disables the veggie button, disables the Select Meal button 
        'makes the Instructions lable invisible, makes the goodbye lable visible and enables the Exit button

        btnPrimeBeef.Enabled = False
        btnVeggie.Enabled = False
        btnSelectMeal.Enabled = False
        lblInstructions.Visible = False
        lblGoodbye.Visible = True
        btnExit.Enabled = True
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'This code activates when the user clicks the Exit button
        'It closes the window and terminates the program

        Close()

    End Sub
End Class
