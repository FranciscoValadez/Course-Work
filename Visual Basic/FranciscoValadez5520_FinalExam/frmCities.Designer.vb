<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmCities
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.btnReturn = New System.Windows.Forms.Button()
        Me.lstCities = New System.Windows.Forms.ListBox()
        Me.lstMedian = New System.Windows.Forms.ListBox()
        Me.lblCities = New System.Windows.Forms.Label()
        Me.lblPrices = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'btnReturn
        '
        Me.btnReturn.Location = New System.Drawing.Point(102, 316)
        Me.btnReturn.Name = "btnReturn"
        Me.btnReturn.Size = New System.Drawing.Size(158, 23)
        Me.btnReturn.TabIndex = 0
        Me.btnReturn.Text = "Return to the Previous Screen"
        Me.btnReturn.UseVisualStyleBackColor = True
        '
        'lstCities
        '
        Me.lstCities.BackColor = System.Drawing.Color.WhiteSmoke
        Me.lstCities.FormattingEnabled = True
        Me.lstCities.Location = New System.Drawing.Point(49, 97)
        Me.lstCities.Name = "lstCities"
        Me.lstCities.Size = New System.Drawing.Size(120, 160)
        Me.lstCities.TabIndex = 1
        '
        'lstMedian
        '
        Me.lstMedian.BackColor = System.Drawing.Color.WhiteSmoke
        Me.lstMedian.FormattingEnabled = True
        Me.lstMedian.Location = New System.Drawing.Point(197, 97)
        Me.lstMedian.Name = "lstMedian"
        Me.lstMedian.Size = New System.Drawing.Size(120, 160)
        Me.lstMedian.TabIndex = 2
        '
        'lblCities
        '
        Me.lblCities.AutoSize = True
        Me.lblCities.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCities.Location = New System.Drawing.Point(46, 66)
        Me.lblCities.Name = "lblCities"
        Me.lblCities.Size = New System.Drawing.Size(47, 15)
        Me.lblCities.TabIndex = 3
        Me.lblCities.Text = "Cities:"
        '
        'lblPrices
        '
        Me.lblPrices.AutoSize = True
        Me.lblPrices.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblPrices.Location = New System.Drawing.Point(194, 66)
        Me.lblPrices.Name = "lblPrices"
        Me.lblPrices.Size = New System.Drawing.Size(51, 15)
        Me.lblPrices.TabIndex = 4
        Me.lblPrices.Text = "Prices:"
        '
        'frmCities
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(363, 381)
        Me.Controls.Add(Me.lblPrices)
        Me.Controls.Add(Me.lblCities)
        Me.Controls.Add(Me.lstMedian)
        Me.Controls.Add(Me.lstCities)
        Me.Controls.Add(Me.btnReturn)
        Me.Name = "frmCities"
        Me.Text = "Cities and Rentals Cost"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnReturn As Button
    Friend WithEvents lstCities As ListBox
    Friend WithEvents lstMedian As ListBox
    Friend WithEvents lblCities As Label
    Friend WithEvents lblPrices As Label
End Class
