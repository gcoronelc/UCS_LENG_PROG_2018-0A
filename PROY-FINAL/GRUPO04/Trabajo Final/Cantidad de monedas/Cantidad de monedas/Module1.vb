Module Module1

    Sub Main()
        Dim n, m1, cinco, m2, dos, m3, uno As Double
        Console.Write("Ingrese monto en soles :")
        n = Console.ReadLine

        m1 = n Mod 5
        cinco = (n - m1) / 5
        m2 = m1 Mod 2
        dos = (m1 - m2) / 2
        m3 = m2
        uno = m3

        Console.WriteLine("{0} monedas de 5 soles, {1} monedas de 2 soles y {2} monedas de 1 sol", cinco, dos, uno)
        Console.ReadKey()




    End Sub

End Module
