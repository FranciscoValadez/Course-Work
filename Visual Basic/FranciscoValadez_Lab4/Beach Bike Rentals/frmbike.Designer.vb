<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmbike
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
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.picBikes = New System.Windows.Forms.PictureBox()
        Me.lblCostHeading = New System.Windows.Forms.Label()
        Me.lblNumberofDays = New System.Windows.Forms.Label()
        Me.txtNumberofDays = New System.Windows.Forms.TextBox()
        Me.lblTotalLabel = New System.Windows.Forms.Label()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.btnCost = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        CType(Me.picBikes, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Cooper Black", 18.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeading.Location = New System.Drawing.Point(79, 9)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(247, 27)
        Me.lblHeading.TabIndex = 0
        Me.lblHeading.Text = "Beach Bike Rentals"
        '
        'picBikes
        '
        Me.picBikes.Image = Global.Beach_Bike_Rentals.My.Resources.Resources.bike
        Me.picBikes.Location = New System.Drawing.Point(-1, 257)
        Me.picBikes.Name = "picBikes"
        Me.picBikes.Size = New System.Drawing.Size(407, 206)
        Me.picBikes.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picBikes.TabIndex = 1
        Me.picBikes.TabStop = False
        '
        'lblCostHeading
        '
        Me.lblCostHeading.AutoSize = True
        Me.lblCostHeading.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCostHeading.Location = New System.Drawing.Point(145, 47)
        Me.lblCostHeading.Name = "lblCostHeading"
        Me.lblCostHeading.Size = New System.Drawing.Size(114, 20)
        Me.lblCostHeading.TabIndex = 2
        Me.lblCostHeading.Text = "$X.XX per Day"
        '
        'lblNumberofDays
        '
        Me.lblNumberofDays.AutoSize = True
        Me.lblNumberofDays.Font = New System.Drawing.Font("Century Gothic", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNumberofDays.Location = New System.Drawing.Point(54, 92)
        Me.lblNumberofDays.Name = "lblNumberofDays"
        Me.lblNumberofDays.Size = New System.Drawing.Size(192, 21)
        Me.lblNumberofDays.TabIndex = 3
        Me.lblNumberofDays.Text = "Number of Rental Days:"
        '
        'txtNumberofDays
        '
        Me.txtNumberofDays.Font = New System.Drawing.Font("Century Gothic", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtNumberofDays.Location = New System.Drawing.Point(288, 89)
        Me.txtNumberofDays.Name = "txtNumberofDays"
        Me.txtNumberofDays.Size = New System.Drawing.Size(25, 27)
        Me.txtNumberofDays.TabIndex = 5
        Me.txtNumberofDays.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'lblTotalLabel
        '
        Me.lblTotalLabel.AutoSize = True
        Me.lblTotalLabel.Font = New System.Drawing.Font("Century Gothic", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalLabel.Location = New System.Drawing.Point(54, 130)
        Me.lblTotalLabel.Name = "lblTotalLabel"
        Me.lblTotalLabel.Size = New System.Drawing.Size(201, 21)
        Me.lblTotalLabel.TabIndex = 6
        Me.lblTotalLabel.Text = "Total Cost of Bike Rental:"
        '
        'lblTotalCost
        '
        Me.lblTotalCost.AutoSize = True
        Me.lblTotalCost.Font = New System.Drawing.Font("Century Schoolbook", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalCost.Location = New System.Drawing.Point(284, 131)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(67, 20)
        Me.lblTotalCost.TabIndex = 7
        Me.lblTotalCost.Text = "$888.88"
        '
        'btnCost
        '
        Me.btnCost.BackColor = System.Drawing.Color.Gold
        Me.btnCost.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCost.Location = New System.Drawing.Point(10, 181)
        Me.btnCost.Name = "btnCost"
        Me.btnCost.Size = New System.Drawing.Size(114, 34)
        Me.btnCost.TabIndex = 8
        Me.btnCost.Text = "Find Cost"
        Me.btnCost.UseVisualStyleBackColor = False
        '
        'btnClear
        '
        Me.btnClear.BackColor = System.Drawing.Color.Gold
        Me.btnClear.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.Location = New System.Drawing.Point(145, 181)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(114, 34)
        Me.btnClear.TabIndex = 9
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = False
        '
        'btnExit
        '
        Me.btnExit.BackColor = System.Drawing.Color.Gold
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(280, 181)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(114, 34)
        Me.btnExit.TabIndex = 10
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = False
        '
        'frmbike
        '
        Me.AcceptButton = Me.btnCost
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.CancelButton = Me.btnClear
        Me.ClientSize = New System.Drawing.Size(404, 461)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnCost)
        Me.Controls.Add(Me.lblTotalCost)
        Me.Controls.Add(Me.lblTotalLabel)
        Me.Controls.Add(Me.txtNumberofDays)
        Me.Controls.Add(Me.lblNumberofDays)
        Me.Controls.Add(Me.lblCostHeading)
        Me.Controls.Add(Me.picBikes)
        Me.Controls.Add(Me.lblHeading)
        Me.Name = "frmbike"
        Me.Text = "Beach Bike Rentals"
        CType(Me.picBikes, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblHeading As Label
    Friend WithEvents picBikes As PictureBox
    Friend WithEvents lblCostHeading As Label
    Friend WithEvents lblNumberofDays As Label
    Friend WithEvents txtNumberofDays As TextBox
    Friend WithEvents lblTotalLabel As Label
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents btnCost As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
