## Бодлого-37
Бодлогын нэр: Left rotation

🔗 Hackerrank холбоос: https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true

#### Бодлогын өгөгдөл:
Массивыг зүүн тийш d алхмаар эргүүлэх үйлдэл. Зүүн эргүүлэх гэдэг нь массивын эхний элементүүдийг сүүлд шилжүүлэх явдал юм.

#### Алгоритм
- d-г n-ээр хуваасан үлдэгдэл олох (d = d % n)
- Элементүүдийг шинэ байрлалд шилжүүлэх
- arr[i] → arr[(i - d + n) % n]
- Цаг хугацааны нарийвчлал: O(n)

#### Hackerrank-ийн амжилтын screenshot:
![Screenshot 2025-06-10 154549](https://github.com/user-attachments/assets/6cfbb93b-be74-424d-b1dc-8bc677f50d72)
