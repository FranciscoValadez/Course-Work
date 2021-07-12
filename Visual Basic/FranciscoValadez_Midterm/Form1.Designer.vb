<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.txtHandsGallons = New System.Windows.Forms.TextBox()
        Me.txtBathingGallons = New System.Windows.Forms.TextBox()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.lblTotalGallons = New System.Windows.Forms.Label()
        Me.lblHandsWashed = New System.Windows.Forms.Label()
        Me.lblBathed = New System.Windows.Forms.Label()
        Me.lblGallonsMessage = New System.Windows.Forms.Label()
        Me.lblCostMessage = New System.Windows.Forms.Label()
        Me.lblHeader = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'txtHandsGallons
        '
        Me.txtHandsGallons.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtHandsGallons.Location = New System.Drawing.Point(321, 175)
        Me.txtHandsGallons.Name = "txtHandsGallons"
        Me.txtHandsGallons.Size = New System.Drawing.Size(71, 26)
        Me.txtHandsGallons.TabIndex = 0
        Me.txtHandsGallons.Text = "8888888"
        '
        'txtBathingGallons
        '
        Me.txtBathingGallons.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtBathingGallons.Location = New System.Drawing.Point(321, 234)
        Me.txtBathingGallons.Name = "txtBathingGallons"
        Me.txtBathingGallons.Size = New System.Drawing.Size(71, 26)
        Me.txtBathingGallons.TabIndex = 1
        Me.txtBathingGallons.Text = "8888888"
        '
        'btnCalculate
        '
        Me.btnCalculate.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalculate.Location = New System.Drawing.Point(185, 305)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(93, 36)
        Me.btnCalculate.TabIndex = 2
        Me.btnCalculate.Text = "Calculate!"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(349, 375)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(93, 36)
        Me.btnExit.TabIndex = 3
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'lblTotalCost
        '
        Me.lblTotalCost.AutoSize = True
        Me.lblTotalCost.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalCost.Location = New System.Drawing.Point(661, 237)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(86, 20)
        Me.lblTotalCost.TabIndex = 4
        Me.lblTotalCost.Text = "TotalCost"
        '
        'lblTotalGallons
        '
        Me.lblTotalGallons.AutoSize = True
        Me.lblTotalGallons.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTotalGallons.Location = New System.Drawing.Point(655, 182)
        Me.lblTotalGallons.Name = "lblTotalGallons"
        Me.lblTotalGallons.Size = New System.Drawing.Size(110, 20)
        Me.lblTotalGallons.TabIndex = 5
        Me.lblTotalGallons.Text = "TotalGallons"
        '
        'lblHandsWashed
        '
        Me.lblHandsWashed.AutoSize = True
        Me.lblHandsWashed.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHandsWashed.Location = New System.Drawing.Point(26, 181)
        Me.lblHandsWashed.Name = "lblHandsWashed"
        Me.lblHandsWashed.Size = New System.Drawing.Size(273, 20)
        Me.lblHandsWashed.TabIndex = 6
        Me.lblHandsWashed.Text = "Number of times Hands were washed"
        '
        'lblBathed
        '
        Me.lblBathed.AutoSize = True
        Me.lblBathed.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblBathed.Location = New System.Drawing.Point(26, 237)
        Me.lblBathed.Name = "lblBathed"
        Me.lblBathed.Size = New System.Drawing.Size(182, 20)
        Me.lblBathed.TabIndex = 7
        Me.lblBathed.Text = "Number Of times bathed"
        '
        'lblGallonsMessage
        '
        Me.lblGallonsMessage.AutoSize = True
        Me.lblGallonsMessage.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGallonsMessage.Location = New System.Drawing.Point(412, 182)
        Me.lblGallonsMessage.Name = "lblGallonsMessage"
        Me.lblGallonsMessage.Size = New System.Drawing.Size(226, 20)
        Me.lblGallonsMessage.TabIndex = 8
        Me.lblGallonsMessage.Text = "Total Number of Gallons Used:"
        '
        'lblCostMessage
        '
        Me.lblCostMessage.AutoSize = True
        Me.lblCostMessage.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCostMessage.Location = New System.Drawing.Point(553, 237)
        Me.lblCostMessage.Name = "lblCostMessage"
        Me.lblCostMessage.Size = New System.Drawing.Size(85, 20)
        Me.lblCostMessage.TabIndex = 9
        Me.lblCostMessage.Text = "Total Cost:"
        '
        'lblHeader
        '
        Me.lblHeader.AutoSize = True
        Me.lblHeader.BackColor = System.Drawing.Color.White
        Me.lblHeader.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeader.Location = New System.Drawing.Point(215, 70)
        Me.lblHeader.Name = "lblHeader"
        Me.lblHeader.Size = New System.Drawing.Size(361, 31)
        Me.lblHeader.TabIndex = 10
        Me.lblHeader.Text = "Monthly Water Bill Calculator"
        '
        'btnClear
        '
        Me.btnClear.DialogResult = System.Windows.Forms.DialogResult.Cancel
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.Location = New System.Drawing.Point(512, 305)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(93, 36)
        Me.btnClear.TabIndex = 11
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = Global.FranciscoValadez_Midterm.My.Resources.Resources.water1
        Me.PictureBox1.Location = New System.Drawing.Point(-4, -214)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(809, 372)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 12
        Me.PictureBox1.TabStop = False
        '
        'Form1
        '
        Me.AcceptButton = Me.btnCalculate
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.ActiveBorder
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.CancelButton = Me.btnClear
        Me.ClientSize = New System.Drawing.Size(790, 433)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.lblHeader)
        Me.Controls.Add(Me.lblCostMessage)
        Me.Controls.Add(Me.lblGallonsMessage)
        Me.Controls.Add(Me.lblBathed)
        Me.Controls.Add(Me.lblHandsWashed)
        Me.Controls.Add(Me.lblTotalGallons)
        Me.Controls.Add(Me.lblTotalCost)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.txtBathingGallons)
        Me.Controls.Add(Me.txtHandsGallons)
        Me.Controls.Add(Me.PictureBox1)
        Me.DoubleBuffered = True
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents txtHandsGallons As TextBox
    Friend WithEvents txtBathingGallons As TextBox
    Friend WithEvents btnCalculate As Button
    Friend WithEvents btnExit As Button
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents lblTotalGallons As Label
    Friend WithEvents lblHandsWashed As Label
    Friend WithEvents lblBathed As Label
    Friend WithEvents lblGallonsMessage As Label
    Friend WithEvents lblCostMessage As Label
    Friend WithEvents lblHeader As Label
    Friend WithEvents btnClear As Button
    Friend WithEvents PictureBox1 As PictureBox
End Class
