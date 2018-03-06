Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim x As Integer
        TextBox1.Text = ""
        For x = 1 To 18
            TextBox1.Text = TextBox1.Text & x & vbCrLf

        Next

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
