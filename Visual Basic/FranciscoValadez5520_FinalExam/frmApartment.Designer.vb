<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmApartment
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmApartment))
        Me.lstCity = New System.Windows.Forms.ListBox()
        Me.lblMessage = New System.Windows.Forms.Label()
        Me.btnCompute = New System.Windows.Forms.Button()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.mnuFile = New System.Windows.Forms.ToolStripMenuItem()
        Me.mnuDispalyCities = New System.Windows.Forms.ToolStripMenuItem()
        Me.mnuClear = New System.Windows.Forms.ToolStripMenuItem()
        Me.mnuExit = New System.Windows.Forms.ToolStripMenuItem()
        Me.picRental = New System.Windows.Forms.PictureBox()
        Me.lblAverage = New System.Windows.Forms.Label()
        Me.lblMedian = New System.Windows.Forms.Label()
        Me.lblHeader = New System.Windows.Forms.Label()
        Me.MenuStrip1.SuspendLayout()
        CType(Me.picRental, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lstCity
        '
        Me.lstCity.BackColor = System.Drawing.Color.WhiteSmoke
        Me.lstCity.FormattingEnabled = True
        Me.lstCity.Location = New System.Drawing.Point(487, 180)
        Me.lstCity.Name = "lstCity"
        Me.lstCity.Size = New System.Drawing.Size(120, 95)
        Me.lstCity.TabIndex = 0
        '
        'lblMessage
        '
        Me.lblMessage.AutoSize = True
        Me.lblMessage.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblMessage.Location = New System.Drawing.Point(484, 145)
        Me.lblMessage.Name = "lblMessage"
        Me.lblMessage.Size = New System.Drawing.Size(132, 16)
        Me.lblMessage.TabIndex = 1
        Me.lblMessage.Text = "Please Select A City:"
        '
        'btnCompute
        '
        Me.btnCompute.Location = New System.Drawing.Point(472, 281)
        Me.btnCompute.Name = "btnCompute"
        Me.btnCompute.Size = New System.Drawing.Size(153, 23)
        Me.btnCompute.TabIndex = 2
        Me.btnCompute.Text = "Compute Average Rental"
        Me.btnCompute.UseVisualStyleBackColor = True
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mnuFile})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(707, 24)
        Me.MenuStrip1.TabIndex = 3
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'mnuFile
        '
        Me.mnuFile.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.mnuDispalyCities, Me.mnuClear, Me.mnuExit})
        Me.mnuFile.Name = "mnuFile"
        Me.mnuFile.Size = New System.Drawing.Size(37, 20)
        Me.mnuFile.Text = "&File"
        '
        'mnuDispalyCities
        '
        Me.mnuDispalyCities.Name = "mnuDispalyCities"
        Me.mnuDispalyCities.Size = New System.Drawing.Size(273, 22)
        Me.mnuDispalyCities.Text = "&Display Top Ten Cities and Rental Cost"
        '
        'mnuClear
        '
        Me.mnuClear.Name = "mnuClear"
        Me.mnuClear.Size = New System.Drawing.Size(187, 22)
        Me.mnuClear.Text = "&Clear"
        '
        'mnuExit
        '
        Me.mnuExit.Name = "mnuExit"
        Me.mnuExit.Size = New System.Drawing.Size(187, 22)
        Me.mnuExit.Text = "E&xit"
        '
        'picRental
        '
        Me.picRental.Image = CType(resources.GetObject("picRental.Image"), System.Drawing.Image)
        Me.picRental.Location = New System.Drawing.Point(0, 12)
        Me.picRental.Name = "picRental"
        Me.picRental.Size = New System.Drawing.Size(406, 381)
        Me.picRental.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picRental.TabIndex = 4
        Me.picRental.TabStop = False
        '
        'lblAverage
        '
        Me.lblAverage.AutoSize = True
        Me.lblAverage.Location = New System.Drawing.Point(437, 359)
        Me.lblAverage.Name = "lblAverage"
        Me.lblAverage.Size = New System.Drawing.Size(208, 13)
        Me.lblAverage.TabIndex = 5
        Me.lblAverage.Text = "XXXXXSELECTEDCITYAVERAGEXXXXX"
        Me.lblAverage.Visible = False
        '
        'lblMedian
        '
        Me.lblMedian.AutoSize = True
        Me.lblMedian.Location = New System.Drawing.Point(437, 324)
        Me.lblMedian.Name = "lblMedian"
        Me.lblMedian.Size = New System.Drawing.Size(206, 13)
        Me.lblMedian.TabIndex = 6
        Me.lblMedian.Text = "XXXXXSELECTEDCITYMEDIANXXXXXX"
        Me.lblMedian.Visible = False
        '
        'lblHeader
        '
        Me.lblHeader.AutoSize = True
        Me.lblHeader.Font = New System.Drawing.Font("Mistral", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeader.Location = New System.Drawing.Point(471, 42)
        Me.lblHeader.Name = "lblHeader"
        Me.lblHeader.Size = New System.Drawing.Size(176, 66)
        Me.lblHeader.TabIndex = 7
        Me.lblHeader.Text = "Apartment Rental " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "by City"
        Me.lblHeader.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'frmApartment
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(707, 393)
        Me.Controls.Add(Me.lblMedian)
        Me.Controls.Add(Me.lblAverage)
        Me.Controls.Add(Me.btnCompute)
        Me.Controls.Add(Me.lblMessage)
        Me.Controls.Add(Me.lstCity)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Controls.Add(Me.picRental)
        Me.Controls.Add(Me.lblHeader)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "frmApartment"
        Me.Text = "Apartment Rental by City"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        CType(Me.picRental, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lstCity As ListBox
    Friend WithEvents lblMessage As Label
    Friend WithEvents btnCompute As Button
    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents mnuFile As ToolStripMenuItem
    Friend WithEvents mnuDispalyCities As ToolStripMenuItem
    Friend WithEvents mnuClear As ToolStripMenuItem
    Friend WithEvents mnuExit As ToolStripMenuItem
    Friend WithEvents picRental As PictureBox
    Friend WithEvents lblAverage As Label
    Friend WithEvents lblMedian As Label
    Friend WithEvents lblHeader As Label
End Class
