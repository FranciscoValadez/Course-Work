'The frmDisplayInventory calss is opened by frmDepreciation
'and dispalys the inventory file in sorted order

Option Strict On
Public Class frmInventory

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        Dim strItem As String

        'sorts the arary
        Array.Sort(frmDepreciation._strInventoryItem)

        'displays the array
        For Each strItem In frmDepreciation._strInventoryItem
            lstDisplay.Items.Add(strItem)
        Next
    End Sub

    Private Sub btnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click
        'this procedure opens the first form
        Dim frmFirst As New frmDepreciation

        Hide()
        frmFirst.ShowDialog()
    End Sub

    Private Sub lstDisplay_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstDisplay.SelectedIndexChanged

    End Sub

End Class