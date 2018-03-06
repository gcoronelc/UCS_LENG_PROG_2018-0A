Public Class Form1
    Private asiento(28) As CheckBox
    Private cta As Integer = 0
    Private pago As Double = 0

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim i As Integer = 0

        For Each c As Control In Me.GroupBox1.Controls
            If TypeOf c Is CheckBox Then
                If c.Enabled Then
                    asiento(i) = c
                    i = i + 1
                End If
            End If
        Next

        ComboBox1.Items.Add("Lima - Trujillo")
        ComboBox1.Items.Add("Lima - Piura")
        
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        For i = 0 To 28

            If asiento(i).Enabled And asiento(i).Checked Then
                asiento(i).Enabled = False
            End If
        Next
        MessageBox.Show("Su reserva se realizo con exito")

        TextBox1.Text = ""
        TextBox2.Text = ""
        TextBox5.Text = ""
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles TextBox2.TextChanged

    End Sub


    Private Sub eventos(sender As Object, e As EventArgs) Handles CheckBox9.CheckedChanged, CheckBox8.CheckedChanged, CheckBox7.CheckedChanged, CheckBox6.CheckedChanged, CheckBox5.CheckedChanged, CheckBox4.CheckedChanged, CheckBox3.CheckedChanged, CheckBox2.CheckedChanged, CheckBox12.CheckedChanged, CheckBox11.CheckedChanged, CheckBox10.CheckedChanged, CheckBox1.CheckedChanged, CheckBox29.CheckedChanged, CheckBox28.CheckedChanged, CheckBox27.CheckedChanged, CheckBox26.CheckedChanged, CheckBox25.CheckedChanged, CheckBox24.CheckedChanged, CheckBox23.CheckedChanged, CheckBox22.CheckedChanged, CheckBox21.CheckedChanged, CheckBox20.CheckedChanged, CheckBox19.CheckedChanged, CheckBox18.CheckedChanged, CheckBox17.CheckedChanged, CheckBox16.CheckedChanged, CheckBox15.CheckedChanged, CheckBox14.CheckedChanged, CheckBox13.CheckedChanged
        cta = 0
        For i = 0 To 28
            If asiento(i).Enabled And asiento(i).Checked Then
                cta = cta + 1

            End If

            TextBox1.Text = "" & cta
        Next

        pago = 80 * cta
        TextBox2.Text = "S/." & pago
        TextBox5.Text = "$" & (pago / 3)


    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged
        TextBox6.Text = "S/.80"

    End Sub

    Private Sub Label3_Click(sender As Object, e As EventArgs) Handles Label3.Click

    End Sub

    Private Sub TextBox4_TextChanged(sender As Object, e As EventArgs) Handles TextBox4.TextChanged

    End Sub

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub
End Class
