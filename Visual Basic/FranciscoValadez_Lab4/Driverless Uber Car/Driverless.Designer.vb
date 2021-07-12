<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Driverless
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Driverless))
        Me.picCar = New System.Windows.Forms.PictureBox()
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.lblMiles = New System.Windows.Forms.Label()
        Me.txtMiles = New System.Windows.Forms.TextBox()
        Me.lblCostlbl = New System.Windows.Forms.Label()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.btnFare = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        CType(Me.picCar, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picCar
        '
        Me.picCar.Image = CType(resources.GetObject("picCar.Image"), System.Drawing.Image)
        Me.picCar.Location = New System.Drawing.Point(-35, 1)
        Me.picCar.Name = "picCar"
        Me.picCar.Size = New System.Drawing.Size(690, 542)
        Me.picCar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picCar.TabIndex = 0
        Me.picCar.TabStop = False
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Open Sans", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeading.ForeColor = System.Drawing.Color.White
        Me.lblHeading.Location = New System.Drawing.Point(697, 64)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(274, 37)
        Me.lblHeading.TabIndex = 1
        Me.lblHeading.Text = "Driverless Uber Car"
        '
        'lblMiles
        '
        Me.lblMiles.AutoSize = True
        Me.lblMiles.BackColor = System.Drawing.Color.DimGray
        Me.lblMiles.Font = New System.Drawing.Font("Open Sans", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblMiles.ForeColor = System.Drawing.Color.White
        Me.lblMiles.Location = New System.Drawing.Point(720, 167)
        Me.lblMiles.Name = "lblMiles"
        Me.lblMiles.Size = New System.Drawing.Size(114, 26)
        Me.lblMiles.TabIndex = 2
        Me.lblMiles.Text = "Total Miles:"
        '
        'txtMiles
        '
        Me.txtMiles.Font = New System.Drawing.Font("Open Sans", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtMiles.Location = New System.Drawing.Point(879, 160)
        Me.txtMiles.Name = "txtMiles"
        Me.txtMiles.Size = New System.Drawing.Size(55, 33)
        Me.txtMiles.TabIndex = 3
        Me.txtMiles.Text = "8,888"
        '
        'lblCostlbl
        '
        Me.lblCostlbl.AutoSize = True
        Me.lblCostlbl.BackColor = System.Drawing.Color.DimGray
        Me.lblCostlbl.Font = New System.Drawing.Font("Open Sans", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCostlbl.ForeColor = System.Drawing.Color.White
        Me.lblCostlbl.Location = New System.Drawing.Point(720, 226)
        Me.lblCostlbl.Name = "lblCostlbl"
        Me.lblCostlbl.Size = New System.Drawing.Size(106, 26)
        Me.lblCostlbl.TabIndex = 4
        Me.lblCostlbl.Text = "Total Cost:"
        '
        'lblTotalCost
        '
        Me.lblTotalCost.AutoSize = True
        Me.lblTotalCost.Font = New System.Drawing.Font("Open Sans", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalCost.ForeColor = System.Drawing.Color.White
        Me.lblTotalCost.Location = New System.Drawing.Point(847, 226)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(94, 26)
        Me.lblTotalCost.TabIndex = 5
        Me.lblTotalCost.Text = "$888,888"
        '
        'btnFare
        '
        Me.btnFare.Font = New System.Drawing.Font("Open Sans", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnFare.ForeColor = System.Drawing.SystemColors.ControlText
        Me.btnFare.Location = New System.Drawing.Point(699, 324)
        Me.btnFare.Name = "btnFare"
        Me.btnFare.Size = New System.Drawing.Size(119, 40)
        Me.btnFare.TabIndex = 6
        Me.btnFare.Text = "Display Fare"
        Me.btnFare.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Font = New System.Drawing.Font("Open Sans", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.ForeColor = System.Drawing.SystemColors.ControlText
        Me.btnClear.Location = New System.Drawing.Point(852, 324)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(119, 40)
        Me.btnClear.TabIndex = 7
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Open Sans", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.ForeColor = System.Drawing.SystemColors.ControlText
        Me.btnExit.Location = New System.Drawing.Point(768, 394)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(119, 40)
        Me.btnExit.TabIndex = 8
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Driverless
        '
        Me.AcceptButton = Me.btnFare
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.DimGray
        Me.ClientSize = New System.Drawing.Size(1008, 537)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnFare)
        Me.Controls.Add(Me.lblTotalCost)
        Me.Controls.Add(Me.lblCostlbl)
        Me.Controls.Add(Me.txtMiles)
        Me.Controls.Add(Me.lblMiles)
        Me.Controls.Add(Me.lblHeading)
        Me.Controls.Add(Me.picCar)
        Me.Name = "Driverless"
        Me.Text = "Driverless Uber Car"
        CType(Me.picCar, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents picCar As PictureBox
    Friend WithEvents lblHeading As Label
    Friend WithEvents lblMiles As Label
    Friend WithEvents txtMiles As TextBox
    Friend WithEvents lblCostlbl As Label
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents btnFare As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents btnExit As Button
End Class
