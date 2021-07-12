<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class frmKaraoke
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmKaraoke))
        Me.grpItems = New System.Windows.Forms.GroupBox()
        Me.lblCost = New System.Windows.Forms.Label()
        Me.txtAmount = New System.Windows.Forms.TextBox()
        Me.lblSelection = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnTotal = New System.Windows.Forms.Button()
        Me.cmbChoice = New System.Windows.Forms.ComboBox()
        Me.lblHeader = New System.Windows.Forms.Label()
        Me.lblInstructions = New System.Windows.Forms.Label()
        Me.grpItems.SuspendLayout()
        Me.SuspendLayout()
        '
        'grpItems
        '
        Me.grpItems.BackColor = System.Drawing.Color.Black
        Me.grpItems.Controls.Add(Me.lblInstructions)
        Me.grpItems.Controls.Add(Me.lblCost)
        Me.grpItems.Controls.Add(Me.txtAmount)
        Me.grpItems.Controls.Add(Me.lblSelection)
        Me.grpItems.Controls.Add(Me.btnClear)
        Me.grpItems.Controls.Add(Me.btnTotal)
        Me.grpItems.Controls.Add(Me.cmbChoice)
        Me.grpItems.Controls.Add(Me.lblHeader)
        Me.grpItems.ForeColor = System.Drawing.SystemColors.ControlText
        Me.grpItems.Location = New System.Drawing.Point(341, -6)
        Me.grpItems.Name = "grpItems"
        Me.grpItems.Size = New System.Drawing.Size(463, 458)
        Me.grpItems.TabIndex = 0
        Me.grpItems.TabStop = False
        '
        'lblCost
        '
        Me.lblCost.AutoSize = True
        Me.lblCost.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCost.ForeColor = System.Drawing.Color.White
        Me.lblCost.Location = New System.Drawing.Point(125, 374)
        Me.lblCost.Name = "lblCost"
        Me.lblCost.Size = New System.Drawing.Size(217, 18)
        Me.lblCost.TabIndex = 6
        Me.lblCost.Text = "XXXXXXXXXXXXXXXXXXX"
        Me.lblCost.Visible = False
        '
        'txtAmount
        '
        Me.txtAmount.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtAmount.Location = New System.Drawing.Point(214, 243)
        Me.txtAmount.Name = "txtAmount"
        Me.txtAmount.Size = New System.Drawing.Size(37, 31)
        Me.txtAmount.TabIndex = 5
        Me.txtAmount.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        Me.txtAmount.Visible = False
        '
        'lblSelection
        '
        Me.lblSelection.AutoSize = True
        Me.lblSelection.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSelection.ForeColor = System.Drawing.Color.White
        Me.lblSelection.Location = New System.Drawing.Point(114, 209)
        Me.lblSelection.Name = "lblSelection"
        Me.lblSelection.Size = New System.Drawing.Size(195, 18)
        Me.lblSelection.TabIndex = 4
        Me.lblSelection.Text = "XXXXXXXXXXXXXXXXX"
        Me.lblSelection.Visible = False
        '
        'btnClear
        '
        Me.btnClear.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.Location = New System.Drawing.Point(251, 293)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(167, 43)
        Me.btnClear.TabIndex = 3
        Me.btnClear.Text = "Clear Form"
        Me.btnClear.UseVisualStyleBackColor = True
        Me.btnClear.Visible = False
        '
        'btnTotal
        '
        Me.btnTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnTotal.Location = New System.Drawing.Point(48, 293)
        Me.btnTotal.Name = "btnTotal"
        Me.btnTotal.Size = New System.Drawing.Size(167, 43)
        Me.btnTotal.TabIndex = 2
        Me.btnTotal.Text = "Total Cost"
        Me.btnTotal.UseVisualStyleBackColor = True
        Me.btnTotal.Visible = False
        '
        'cmbChoice
        '
        Me.cmbChoice.FormattingEnabled = True
        Me.cmbChoice.Items.AddRange(New Object() {"Hours in Private Karaoke Booth ($8.99 per hour)", "Songs in Private Karaoke Booth ($2.99 per hour)"})
        Me.cmbChoice.Location = New System.Drawing.Point(98, 163)
        Me.cmbChoice.Name = "cmbChoice"
        Me.cmbChoice.Size = New System.Drawing.Size(268, 21)
        Me.cmbChoice.TabIndex = 1
        '
        'lblHeader
        '
        Me.lblHeader.AutoSize = True
        Me.lblHeader.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeader.ForeColor = System.Drawing.Color.White
        Me.lblHeader.Location = New System.Drawing.Point(64, 55)
        Me.lblHeader.Name = "lblHeader"
        Me.lblHeader.Size = New System.Drawing.Size(332, 37)
        Me.lblHeader.TabIndex = 0
        Me.lblHeader.Text = "Karaoke Music Night"
        '
        'lblInstructions
        '
        Me.lblInstructions.AutoSize = True
        Me.lblInstructions.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblInstructions.ForeColor = System.Drawing.Color.White
        Me.lblInstructions.Location = New System.Drawing.Point(95, 129)
        Me.lblInstructions.Name = "lblInstructions"
        Me.lblInstructions.Size = New System.Drawing.Size(200, 18)
        Me.lblInstructions.TabIndex = 7
        Me.lblInstructions.Text = "Please Make A Selection:"
        '
        'frmKaraoke
        '
        Me.AcceptButton = Me.btnTotal
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.CancelButton = Me.btnClear
        Me.ClientSize = New System.Drawing.Size(800, 443)
        Me.Controls.Add(Me.grpItems)
        Me.Name = "frmKaraoke"
        Me.Text = "Karaoke Music Night"
        Me.grpItems.ResumeLayout(False)
        Me.grpItems.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents grpItems As GroupBox
    Friend WithEvents lblHeader As Label
    Friend WithEvents btnClear As Button
    Friend WithEvents btnTotal As Button
    Friend WithEvents cmbChoice As ComboBox
    Friend WithEvents lblCost As Label
    Friend WithEvents txtAmount As TextBox
    Friend WithEvents lblSelection As Label
    Friend WithEvents lblInstructions As Label
End Class
