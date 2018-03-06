Public Class Form1

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TextBox1.TextChanged

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim texto As String

        texto = TextBox1.Text.Trim()
        If texto.Length > 0 Then
            ListBox1.Items.Add(texto)
            TextBox1.Text = ""
            Label1.Text = ListBox1.Items.Count
        Else
            MessageBox.Show("Digite texto")
        End If

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        If ListBox1.SelectedIndex <> -1 Then
            ListBox1.Items.RemoveAt(ListBox1.SelectedIndex)

            Label1.Text = ListBox1.Items.Count
        ElseIf ListBox2.SelectedIndex <> -1 Then
            ListBox2.Items.RemoveAt(ListBox2.SelectedIndex)

            Label2.Text = ListBox2.Items.Count
        Else

            MessageBox.Show("Seleccione alumno")
            End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        If ListBox1.SelectedIndex <> -1 Then
            ListBox2.Items.Add(ListBox1.SelectedItem)
            ListBox1.Items.RemoveAt(ListBox1.SelectedIndex)
            Label1.Text = ListBox1.Items.Count
            Label2.Text = ListBox2.Items.Count
        Else

            MessageBox.Show("Seleccione al alumno ")
        End If


    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        If ListBox2.SelectedIndex <> -1 Then
            ListBox1.Items.Add(ListBox2.SelectedItem)
            ListBox2.Items.RemoveAt(ListBox2.SelectedIndex)
            Label2.Text = ListBox2.Items.Count
            Label1.Text = ListBox1.Items.Count
        Else
            MessageBox.Show("Seleccione al alumno")
        End If
    End Sub

    Private Sub Form1_Shown(sender As Object, e As EventArgs) Handles MyBase.Shown
        TextBox1.Focus()
    End Sub
End Class
