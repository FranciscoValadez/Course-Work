<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Internet
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Internet))
        Me.lblHeader = New System.Windows.Forms.Label()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.lstSpeed = New System.Windows.Forms.ListBox()
        Me.lblAverage = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lblHeader
        '
        Me.lblHeader.AutoSize = True
        Me.lblHeader.BackColor = System.Drawing.Color.Transparent
        Me.lblHeader.Font = New System.Drawing.Font("Counter-Strike", 18.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeader.ForeColor = System.Drawing.Color.Black
        Me.lblHeader.Location = New System.Drawing.Point(213, 28)
        Me.lblHeader.Name = "lblHeader"
        Me.lblHeader.Size = New System.Drawing.Size(273, 36)
        Me.lblHeader.TabIndex = 0
        Me.lblHeader.Text = "Internet Speed Test" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Survey"
        Me.lblHeader.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'btnCalculate
        '
        Me.btnCalculate.BackColor = System.Drawing.Color.Transparent
        Me.btnCalculate.Font = New System.Drawing.Font("Counter-Strike", 12.0!, System.Drawing.FontStyle.Bold)
        Me.btnCalculate.Location = New System.Drawing.Point(345, 224)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(129, 29)
        Me.btnCalculate.TabIndex = 1
        Me.btnCalculate.Text = "Enter Speed"
        Me.btnCalculate.UseVisualStyleBackColor = False
        '
        'lstSpeed
        '
        Me.lstSpeed.Font = New System.Drawing.Font("Counter-Strike", 12.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle))
        Me.lstSpeed.FormattingEnabled = True
        Me.lstSpeed.ItemHeight = 12
        Me.lstSpeed.Location = New System.Drawing.Point(366, 100)
        Me.lstSpeed.Name = "lstSpeed"
        Me.lstSpeed.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.lstSpeed.Size = New System.Drawing.Size(74, 88)
        Me.lstSpeed.TabIndex = 2
        '
        'lblAverage
        '
        Me.lblAverage.AutoSize = True
        Me.lblAverage.Font = New System.Drawing.Font("Counter-Strike", 15.75!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblAverage.Location = New System.Drawing.Point(142, 309)
        Me.lblAverage.Name = "lblAverage"
        Me.lblAverage.Size = New System.Drawing.Size(363, 16)
        Me.lblAverage.TabIndex = 3
        Me.lblAverage.Text = "Average speed is XXX.XX Mbps"
        Me.lblAverage.Visible = False
        '
        'Internet
        '
        Me.AcceptButton = Me.btnCalculate
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom
        Me.ClientSize = New System.Drawing.Size(517, 347)
        Me.Controls.Add(Me.lblAverage)
        Me.Controls.Add(Me.lstSpeed)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.lblHeader)
        Me.Name = "Internet"
        Me.Text = "Internet Speed Test Survey"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblHeader As Label
    Friend WithEvents btnCalculate As Button
    Friend WithEvents lstSpeed As ListBox
    Friend WithEvents lblAverage As Label
End Class
