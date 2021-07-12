'The frmDisplayInventory calss is opened by frmDepreciation
'and dispalys the inventory file in sorted order

Option Strict On
Public Class frmInventory

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        'When frmInventory is loaded, the array is from frmDepreciation is sorted and displayed
        'for the user to see inside of a listbox

        Dim strItem As String

        'sorts the arary
        Array.Sort(frmDepreciation._strInventoryItem)

        'displays the array in a listbox
        For Each strItem In frmDepreciation._strInventoryItem
            lstDisplay.Items.Add(strItem)
        Next
    End Sub

    Private Sub btnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click
        'When the user clicks the Return button, frmInventory is hidden and frmDepreciation is dispalyed

        'this procedure opens the first form
        Dim frmFirst As New frmDepreciation

        'Hides this form and shows frmDepreciation
        Hide()
        frmFirst.ShowDialog()
    End Sub

    Private Sub lstDisplay_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstDisplay.SelectedIndexChanged

    End Sub
End Class