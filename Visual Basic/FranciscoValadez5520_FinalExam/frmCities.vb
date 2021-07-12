Public Class frmCities
    Private Sub btnReturn_Click(sender As Object, e As EventArgs) Handles btnReturn.Click

        Dim frmMain As New frmApartment

        'Hides the form frmCities
        Hide()
        'Shows the frmApartment
        frmMain.ShowDialog()

    End Sub

    Private Sub frmCities_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim strItem As String
        Dim strValue As String

        'fills the listbox with the city names 
        For Each strItem In frmApartment._city
            lstCities.Items.Add(strItem)
        Next

        'fills the listbox with the prices
        For Each strValue In frmApartment._median
            If strValue <> "" Then
                lstMedian.Items.Add((Convert.ToInt32(strValue)).ToString("C"))
            End If

        Next

    End Sub
End Class