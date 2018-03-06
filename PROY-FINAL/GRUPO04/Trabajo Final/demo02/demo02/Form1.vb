Public Class Form1

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim s1, s2 As String
        Dim x1, x2 As Double
        Dim ok As Boolean = True

        s1 = TextBox1.Text.Trim()
        s2 = TextBox2.Text.Trim()

        If s1 = "" Then
            MessageBox.Show("Ingrese Valor 1")

        Else
            Try
                x1 = Convert.ToDouble(s1)

            Catch ex As Exception
                MessageBox.Show("Valor 1 Incorrecto")
                ok = False

            End Try

        End If

        If s2 = "" Then
            MessageBox.Show("Ingrese Valor 2")

        Else
            Try
                x2 = Convert.ToDouble(s2)

            Catch ex As Exception
                MessageBox.Show("Valor 2 Incorrecto")
                ok = False

            End Try

        End If
        If ok Then
            TextBox3.Text = Convert.ToString(x1 + x2)

        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim s1, s2 As String
        Dim x1, x2 As Double
        Dim ok As Boolean = True

        s1 = TextBox1.Text.Trim()
        s2 = TextBox2.Text.Trim()

        If s1 = "" Then
            MessageBox.Show("Ingrese Valor 1")

        Else
            Try
                x1 = Convert.ToDouble(s1)

            Catch ex As Exception
                MessageBox.Show("Valor 1 Incorrecto")
                ok = False

            End Try

        End If

        If s2 = "" Then
            MessageBox.Show("Ingrese Valor 2")

        Else
            Try
                x2 = Convert.ToDouble(s2)

            Catch ex As Exception
                MessageBox.Show("Valor 2 Incorrecto")
                ok = False

            End Try

        End If
        If ok Then
            TextBox3.Text = Convert.ToString(x1 - x2)

        End If
    End Sub


    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim s1, s2 As String
        Dim x1, x2 As Double
        Dim ok As Boolean = True

        s1 = TextBox1.Text.Trim()
        s2 = TextBox2.Text.Trim()

        If s1 = "" Then
            MessageBox.Show("Ingrese Valor 1")

        Else
            Try
                x1 = Convert.ToDouble(s1)

            Catch ex As Exception
                MessageBox.Show("Valor 1 Incorrecto")
                ok = False

            End Try

        End If

        If s2 = "" Then
            MessageBox.Show("Ingrese Valor 2")

        Else
            Try
                x2 = Convert.ToDouble(s2)

            Catch ex As Exception
                MessageBox.Show("Valor 2 Incorrecto")
                ok = False

            End Try

        End If
        If ok Then
            TextBox3.Text = Convert.ToString(x1 * x2)

        End If
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Dim s1, s2 As String
        Dim x1, x2 As Double
        Dim ok As Boolean = True

        s1 = TextBox1.Text.Trim()
        s2 = TextBox2.Text.Trim()

        If s1 = "" Then
            MessageBox.Show("Ingrese Valor 1")

        Else
            Try
                x1 = Convert.ToDouble(s1)

            Catch ex As Exception
                MessageBox.Show("Valor 1 Incorrecto")
                ok = False

            End Try

        End If

        If s2 = "" Then
            MessageBox.Show("Ingrese Valor 2")

        Else
            Try
                x2 = Convert.ToDouble(s2)

            Catch ex As Exception
                MessageBox.Show("Valor 2 Incorrecto")
                ok = False

            End Try

        End If
        If ok Then
            TextBox3.Text = Convert.ToString(x1 / x2)

        End If
    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub
End Class
