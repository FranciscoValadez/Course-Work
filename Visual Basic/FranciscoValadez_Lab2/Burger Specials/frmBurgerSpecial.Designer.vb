<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmBurgerSpecial
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
        Me.btnPrimeBeef = New System.Windows.Forms.Button()
        Me.btnSelectMeal = New System.Windows.Forms.Button()
        Me.btnVeggie = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.lblHeading = New System.Windows.Forms.Label()
        Me.lblInstructions = New System.Windows.Forms.Label()
        Me.lblGoodbye = New System.Windows.Forms.Label()
        Me.picVeggie = New System.Windows.Forms.PictureBox()
        Me.picPrimeBeef = New System.Windows.Forms.PictureBox()
        CType(Me.picVeggie, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picPrimeBeef, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnPrimeBeef
        '
        Me.btnPrimeBeef.Location = New System.Drawing.Point(147, 299)
        Me.btnPrimeBeef.Name = "btnPrimeBeef"
        Me.btnPrimeBeef.Size = New System.Drawing.Size(100, 23)
        Me.btnPrimeBeef.TabIndex = 0
        Me.btnPrimeBeef.Text = "Prime Beef"
        Me.btnPrimeBeef.UseVisualStyleBackColor = True
        '
        'btnSelectMeal
        '
        Me.btnSelectMeal.Location = New System.Drawing.Point(350, 299)
        Me.btnSelectMeal.Name = "btnSelectMeal"
        Me.btnSelectMeal.Size = New System.Drawing.Size(100, 23)
        Me.btnSelectMeal.TabIndex = 1
        Me.btnSelectMeal.Text = "Select Meal"
        Me.btnSelectMeal.UseVisualStyleBackColor = True
        '
        'btnVeggie
        '
        Me.btnVeggie.Location = New System.Drawing.Point(553, 299)
        Me.btnVeggie.Name = "btnVeggie"
        Me.btnVeggie.Size = New System.Drawing.Size(100, 23)
        Me.btnVeggie.TabIndex = 2
        Me.btnVeggie.Text = "Veggie"
        Me.btnVeggie.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(350, 397)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(100, 23)
        Me.btnExit.TabIndex = 3
        Me.btnExit.Text = "Exit Window"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'lblHeading
        '
        Me.lblHeading.AutoSize = True
        Me.lblHeading.Font = New System.Drawing.Font("Tahoma", 15.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblHeading.Location = New System.Drawing.Point(289, 13)
        Me.lblHeading.Name = "lblHeading"
        Me.lblHeading.Size = New System.Drawing.Size(222, 25)
        Me.lblHeading.TabIndex = 4
        Me.lblHeading.Text = "Farm Burger Special"
        '
        'lblInstructions
        '
        Me.lblInstructions.AutoSize = True
        Me.lblInstructions.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblInstructions.Location = New System.Drawing.Point(246, 343)
        Me.lblInstructions.Name = "lblInstructions"
        Me.lblInstructions.Size = New System.Drawing.Size(308, 14)
        Me.lblInstructions.TabIndex = 6
        Me.lblInstructions.Text = "Choose a burger and then click the Select Meal button"
        '
        'lblGoodbye
        '
        Me.lblGoodbye.AutoSize = True
        Me.lblGoodbye.Font = New System.Drawing.Font("Tahoma", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGoodbye.Location = New System.Drawing.Point(338, 361)
        Me.lblGoodbye.Name = "lblGoodbye"
        Me.lblGoodbye.Size = New System.Drawing.Size(144, 14)
        Me.lblGoodbye.TabIndex = 7
        Me.lblGoodbye.Text = "Enjoy your burger special"
        '
        'picVeggie
        '
        Me.picVeggie.Image = Global.Burger_Specials.My.Resources.Resources.sweet_potato_black_bean_veggie_burgers_1
        Me.picVeggie.Location = New System.Drawing.Point(480, 51)
        Me.picVeggie.Name = "picVeggie"
        Me.picVeggie.Size = New System.Drawing.Size(247, 225)
        Me.picVeggie.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picVeggie.TabIndex = 8
        Me.picVeggie.TabStop = False
        '
        'picPrimeBeef
        '
        Me.picPrimeBeef.Image = Global.Burger_Specials.My.Resources.Resources._96637aabb562881adec1336c0d78acc6cc5d1403
        Me.picPrimeBeef.Location = New System.Drawing.Point(74, 51)
        Me.picPrimeBeef.Name = "picPrimeBeef"
        Me.picPrimeBeef.Size = New System.Drawing.Size(247, 225)
        Me.picPrimeBeef.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picPrimeBeef.TabIndex = 5
        Me.picPrimeBeef.TabStop = False
        '
        'frmBurgerSpecial
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.picVeggie)
        Me.Controls.Add(Me.lblGoodbye)
        Me.Controls.Add(Me.lblInstructions)
        Me.Controls.Add(Me.picPrimeBeef)
        Me.Controls.Add(Me.lblHeading)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnVeggie)
        Me.Controls.Add(Me.btnSelectMeal)
        Me.Controls.Add(Me.btnPrimeBeef)
        Me.Name = "frmBurgerSpecial"
        Me.Text = "Burger Specials"
        CType(Me.picVeggie, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picPrimeBeef, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnPrimeBeef As Button
    Friend WithEvents btnSelectMeal As Button
    Friend WithEvents btnVeggie As Button
    Friend WithEvents btnExit As Button
    Friend WithEvents lblHeading As Label
    Friend WithEvents picPrimeBeef As PictureBox
    Friend WithEvents lblInstructions As Label
    Friend WithEvents lblGoodbye As Label
    Friend WithEvents picVeggie As PictureBox
End Class
