<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmDecking
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmDecking))
        Me.grpDeckType = New System.Windows.Forms.GroupBox()
        Me.radComposite = New System.Windows.Forms.RadioButton()
        Me.radRedWood = New System.Windows.Forms.RadioButton()
        Me.radLumber = New System.Windows.Forms.RadioButton()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.lblSquareFeet = New System.Windows.Forms.Label()
        Me.txtFootage = New System.Windows.Forms.TextBox()
        Me.lblCost = New System.Windows.Forms.Label()
        Me.lblCostEstimate = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.picDeck = New System.Windows.Forms.PictureBox()
        Me.grpDeckType.SuspendLayout()
        CType(Me.picDeck, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'grpDeckType
        '
        Me.grpDeckType.BackColor = System.Drawing.Color.AliceBlue
        Me.grpDeckType.Controls.Add(Me.radComposite)
        Me.grpDeckType.Controls.Add(Me.radRedWood)
        Me.grpDeckType.Controls.Add(Me.radLumber)
        Me.grpDeckType.Font = New System.Drawing.Font("Goudy Old Style", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.grpDeckType.ForeColor = System.Drawing.Color.Sienna
        Me.grpDeckType.Location = New System.Drawing.Point(63, 127)
        Me.grpDeckType.Name = "grpDeckType"
        Me.grpDeckType.Size = New System.Drawing.Size(244, 133)
        Me.grpDeckType.TabIndex = 0
        Me.grpDeckType.TabStop = False
        Me.grpDeckType.Text = "Decking Type"
        '
        'radComposite
        '
        Me.radComposite.AutoSize = True
        Me.radComposite.Location = New System.Drawing.Point(24, 95)
        Me.radComposite.Name = "radComposite"
        Me.radComposite.Size = New System.Drawing.Size(111, 27)
        Me.radComposite.TabIndex = 2
        Me.radComposite.Text = "Composite"
        Me.radComposite.UseVisualStyleBackColor = True
        '
        'radRedWood
        '
        Me.radRedWood.AutoSize = True
        Me.radRedWood.Location = New System.Drawing.Point(24, 62)
        Me.radRedWood.Name = "radRedWood"
        Me.radRedWood.Size = New System.Drawing.Size(100, 27)
        Me.radRedWood.TabIndex = 1
        Me.radRedWood.Text = "Redwood"
        Me.radRedWood.UseVisualStyleBackColor = True
        '
        'radLumber
        '
        Me.radLumber.AutoSize = True
        Me.radLumber.Checked = True
        Me.radLumber.Location = New System.Drawing.Point(24, 29)
        Me.radLumber.Name = "radLumber"
        Me.radLumber.Size = New System.Drawing.Size(206, 27)
        Me.radLumber.TabIndex = 0
        Me.radLumber.TabStop = True
        Me.radLumber.Text = "Pressure-Treated Wood"
        Me.radLumber.UseVisualStyleBackColor = True
        '
        'btnCalculate
        '
        Me.btnCalculate.Font = New System.Drawing.Font("Goudy Old Style", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalculate.ForeColor = System.Drawing.Color.Sienna
        Me.btnCalculate.Location = New System.Drawing.Point(53, 303)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(116, 41)
        Me.btnCalculate.TabIndex = 1
        Me.btnCalculate.Text = "Calculate"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Goudy Old Style", 24.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeading.ForeColor = System.Drawing.Color.Sienna
        Me.lblHeading.Location = New System.Drawing.Point(17, 48)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(337, 37)
        Me.lblHeading.TabIndex = 2
        Me.lblHeading.Text = "Decking Cost Calculator"
        '
        'lblSquareFeet
        '
        Me.lblSquareFeet.AutoSize = True
        Me.lblSquareFeet.Font = New System.Drawing.Font("Goudy Old Style", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblSquareFeet.ForeColor = System.Drawing.Color.Sienna
        Me.lblSquareFeet.Location = New System.Drawing.Point(79, 88)
        Me.lblSquareFeet.Name = "lblSquareFeet"
        Me.lblSquareFeet.Size = New System.Drawing.Size(143, 25)
        Me.lblSquareFeet.TabIndex = 3
        Me.lblSquareFeet.Text = "Square Footage"
        '
        'txtFootage
        '
        Me.txtFootage.Font = New System.Drawing.Font("Goudy Old Style", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtFootage.ForeColor = System.Drawing.Color.Sienna
        Me.txtFootage.Location = New System.Drawing.Point(228, 88)
        Me.txtFootage.Name = "txtFootage"
        Me.txtFootage.Size = New System.Drawing.Size(63, 33)
        Me.txtFootage.TabIndex = 4
        '
        'lblCost
        '
        Me.lblCost.AutoSize = True
        Me.lblCost.Font = New System.Drawing.Font("Goudy Old Style", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCost.ForeColor = System.Drawing.Color.Sienna
        Me.lblCost.Location = New System.Drawing.Point(70, 263)
        Me.lblCost.Name = "lblCost"
        Me.lblCost.Size = New System.Drawing.Size(130, 25)
        Me.lblCost.TabIndex = 5
        Me.lblCost.Text = "Cost Estimate"
        '
        'lblCostEstimate
        '
        Me.lblCostEstimate.AutoSize = True
        Me.lblCostEstimate.Font = New System.Drawing.Font("Goudy Old Style", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblCostEstimate.ForeColor = System.Drawing.Color.Sienna
        Me.lblCostEstimate.Location = New System.Drawing.Point(206, 263)
        Me.lblCostEstimate.Name = "lblCostEstimate"
        Me.lblCostEstimate.Size = New System.Drawing.Size(94, 25)
        Me.lblCostEstimate.TabIndex = 6
        Me.lblCostEstimate.Text = "$0000.00"
        '
        'btnClear
        '
        Me.btnClear.Font = New System.Drawing.Font("Goudy Old Style", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnClear.ForeColor = System.Drawing.Color.Sienna
        Me.btnClear.Location = New System.Drawing.Point(201, 302)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(116, 41)
        Me.btnClear.TabIndex = 7
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'picDeck
        '
        Me.picDeck.Image = CType(resources.GetObject("picDeck.Image"), System.Drawing.Image)
        Me.picDeck.Location = New System.Drawing.Point(369, 0)
        Me.picDeck.Name = "picDeck"
        Me.picDeck.Size = New System.Drawing.Size(338, 394)
        Me.picDeck.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picDeck.TabIndex = 8
        Me.picDeck.TabStop = False
        '
        'frmDecking
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(704, 392)
        Me.Controls.Add(Me.picDeck)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.lblCostEstimate)
        Me.Controls.Add(Me.lblCost)
        Me.Controls.Add(Me.txtFootage)
        Me.Controls.Add(Me.lblSquareFeet)
        Me.Controls.Add(Me.lblHeading)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.grpDeckType)
        Me.Name = "frmDecking"
        Me.Text = "Decking Cost Calculator"
        Me.grpDeckType.ResumeLayout(False)
        Me.grpDeckType.PerformLayout()
        CType(Me.picDeck, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents grpDeckType As GroupBox
    Friend WithEvents radComposite As RadioButton
    Friend WithEvents radRedWood As RadioButton
    Friend WithEvents radLumber As RadioButton
    Friend WithEvents btnCalculate As Button
    Friend WithEvents lblHeading As Label
    Friend WithEvents lblSquareFeet As Label
    Friend WithEvents txtFootage As TextBox
    Friend WithEvents lblCost As Label
    Friend WithEvents lblCostEstimate As Label
    Friend WithEvents btnClear As Button
    Friend WithEvents picDeck As PictureBox
End Class
