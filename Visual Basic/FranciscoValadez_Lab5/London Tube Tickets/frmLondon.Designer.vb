<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmLondon
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmLondon))
        Me.grpZoneSelection = New System.Windows.Forms.GroupBox()
        Me.radZOneSix = New System.Windows.Forms.RadioButton()
        Me.radZOneFive = New System.Windows.Forms.RadioButton()
        Me.radZOneThree = New System.Windows.Forms.RadioButton()
        Me.txtTickets = New System.Windows.Forms.TextBox()
        Me.lblTicketAmount = New System.Windows.Forms.Label()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.lblCostMessage = New System.Windows.Forms.Label()
        Me.lblTotalCost = New System.Windows.Forms.Label()
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.picBigBen = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.grpZoneSelection.SuspendLayout()
        CType(Me.picBigBen, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'grpZoneSelection
        '
        Me.grpZoneSelection.BackColor = System.Drawing.Color.White
        Me.grpZoneSelection.Controls.Add(Me.radZOneSix)
        Me.grpZoneSelection.Controls.Add(Me.radZOneFive)
        Me.grpZoneSelection.Controls.Add(Me.radZOneThree)
        Me.grpZoneSelection.Location = New System.Drawing.Point(287, 179)
        Me.grpZoneSelection.Name = "grpZoneSelection"
        Me.grpZoneSelection.Size = New System.Drawing.Size(226, 98)
        Me.grpZoneSelection.TabIndex = 0
        Me.grpZoneSelection.TabStop = False
        Me.grpZoneSelection.Text = "Zone Selection"
        '
        'radZOneSix
        '
        Me.radZOneSix.AutoSize = True
        Me.radZOneSix.Location = New System.Drawing.Point(34, 65)
        Me.radZOneSix.Name = "radZOneSix"
        Me.radZOneSix.Size = New System.Drawing.Size(79, 17)
        Me.radZOneSix.TabIndex = 2
        Me.radZOneSix.Text = "Zones 1 - 6"
        Me.radZOneSix.UseVisualStyleBackColor = True
        '
        'radZOneFive
        '
        Me.radZOneFive.AutoSize = True
        Me.radZOneFive.Location = New System.Drawing.Point(34, 42)
        Me.radZOneFive.Name = "radZOneFive"
        Me.radZOneFive.Size = New System.Drawing.Size(79, 17)
        Me.radZOneFive.TabIndex = 1
        Me.radZOneFive.Text = "Zones 1 - 5"
        Me.radZOneFive.UseVisualStyleBackColor = True
        '
        'radZOneThree
        '
        Me.radZOneThree.AutoSize = True
        Me.radZOneThree.Checked = True
        Me.radZOneThree.Location = New System.Drawing.Point(34, 19)
        Me.radZOneThree.Name = "radZOneThree"
        Me.radZOneThree.Size = New System.Drawing.Size(76, 17)
        Me.radZOneThree.TabIndex = 0
        Me.radZOneThree.TabStop = True
        Me.radZOneThree.Text = "Zones 1 -3"
        Me.radZOneThree.UseVisualStyleBackColor = True
        '
        'txtTickets
        '
        Me.txtTickets.Location = New System.Drawing.Point(426, 110)
        Me.txtTickets.Name = "txtTickets"
        Me.txtTickets.Size = New System.Drawing.Size(51, 20)
        Me.txtTickets.TabIndex = 1
        '
        'lblTicketAmount
        '
        Me.lblTicketAmount.AutoSize = True
        Me.lblTicketAmount.Location = New System.Drawing.Point(324, 113)
        Me.lblTicketAmount.Name = "lblTicketAmount"
        Me.lblTicketAmount.Size = New System.Drawing.Size(96, 13)
        Me.lblTicketAmount.TabIndex = 2
        Me.lblTicketAmount.Text = "Amount of Tickets:"
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(293, 353)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(75, 23)
        Me.btnCalculate.TabIndex = 3
        Me.btnCalculate.Text = "Calculate"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(432, 353)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 23)
        Me.btnClear.TabIndex = 4
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'lblCostMessage
        '
        Me.lblCostMessage.AutoSize = True
        Me.lblCostMessage.Location = New System.Drawing.Point(318, 306)
        Me.lblCostMessage.Name = "lblCostMessage"
        Me.lblCostMessage.Size = New System.Drawing.Size(95, 13)
        Me.lblCostMessage.TabIndex = 5
        Me.lblCostMessage.Text = "Total Cost in USD:"
        '
        'lblTotalCost
        '
        Me.lblTotalCost.AutoSize = True
        Me.lblTotalCost.Location = New System.Drawing.Point(436, 306)
        Me.lblTotalCost.Name = "lblTotalCost"
        Me.lblTotalCost.Size = New System.Drawing.Size(46, 13)
        Me.lblTotalCost.TabIndex = 6
        Me.lblTotalCost.Text = "$000.00"
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeading.Location = New System.Drawing.Point(250, 49)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(301, 25)
        Me.lblHeading.TabIndex = 7
        Me.lblHeading.Text = "London Ticket Cost Calculator" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10)
        '
        'picBigBen
        '
        Me.picBigBen.BackgroundImage = CType(resources.GetObject("picBigBen.BackgroundImage"), System.Drawing.Image)
        Me.picBigBen.Image = CType(resources.GetObject("picBigBen.Image"), System.Drawing.Image)
        Me.picBigBen.Location = New System.Drawing.Point(-5, -9)
        Me.picBigBen.Name = "picBigBen"
        Me.picBigBen.Size = New System.Drawing.Size(249, 462)
        Me.picBigBen.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picBigBen.TabIndex = 8
        Me.picBigBen.TabStop = False
        '
        'PictureBox2
        '
        Me.PictureBox2.Image = CType(resources.GetObject("PictureBox2.Image"), System.Drawing.Image)
        Me.PictureBox2.InitialImage = CType(resources.GetObject("PictureBox2.InitialImage"), System.Drawing.Image)
        Me.PictureBox2.Location = New System.Drawing.Point(557, -9)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(249, 462)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 9
        Me.PictureBox2.TabStop = False
        '
        'frmLondon
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.PictureBox2)
        Me.Controls.Add(Me.picBigBen)
        Me.Controls.Add(Me.lblHeading)
        Me.Controls.Add(Me.lblTotalCost)
        Me.Controls.Add(Me.lblCostMessage)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.lblTicketAmount)
        Me.Controls.Add(Me.txtTickets)
        Me.Controls.Add(Me.grpZoneSelection)
        Me.Name = "frmLondon"
        Me.Text = "London Tube Tickets"
        Me.grpZoneSelection.ResumeLayout(False)
        Me.grpZoneSelection.PerformLayout()
        CType(Me.picBigBen, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents grpZoneSelection As GroupBox
    Friend WithEvents radZOneSix As RadioButton
    Friend WithEvents radZOneFive As RadioButton
    Friend WithEvents radZOneThree As RadioButton
    Friend WithEvents txtTickets As TextBox
    Friend WithEvents lblTicketAmount As Label
    Friend WithEvents btnCalculate As Button
    Friend WithEvents btnClear As Button
    Friend WithEvents lblCostMessage As Label
    Friend WithEvents lblTotalCost As Label
    Friend WithEvents lblHeading As Label
    Friend WithEvents picBigBen As PictureBox
    Friend WithEvents PictureBox2 As PictureBox
End Class
