## Бодлого-29
Бодлогын нэр: Array manipulation

🔗 Hackerrank холбоос: https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true

#### Бодлогын өгөгдөл:
Массивын тодорхой хэсэгт утга нэмэх үйлдлүүдийг хийсний дараа хамгийн их утгатай элементийг олох бодлого. Range update асуултуудыг боловсруулна.

#### Алгоритм
Difference Array ашиглах:

- Difference array үүсгэх
- Range update: diff[a] += k, diff[b+1] -= k
- Prefix sum тооцоолж жинхэнэ утгуудыг олох
- Хамгийн их утгыг олох
- Цаг хугацааны нарийвчлал: O(n + m)

#### Hackerrank-ийн амжилтын screenshot:
![Screenshot 2025-06-10 151619](https://github.com/user-attachments/assets/39dbc6a2-2792-41c7-8e2d-de00c2c77f7d)
