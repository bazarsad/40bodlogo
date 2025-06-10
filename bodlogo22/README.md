## Бодлого-22
Бодлогын нэр: Cycle detection

🔗 Hackerrank холбоос: https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem?isFullScreen=true

#### Бодлогын өгөгдөл:
Энэ бодлого нь холбоостой жагсаалт (Linked List) дахь мөчлөгийг илрүүлэх талаар юм. Хэрэв жагсаалтын хоёр өөр node нь ижил дараагийн node-г заасан бол мөчлөг үүссэн гэж үзнэ.

#### Алгоритм
Floyd's Cycle Detection (Tortoise and Hare):
- Хоёр указатель ашиглана - удаан болон хурдан
- Удаан указатель нэг алхам, хурдан указатель хоёр алхам хийнэ
- Хэрэв тэд уулзвал мөчлөг байна
- Цаг хугацааны нарийвчлал: O(n)
- Санах ойн нарийвчлал: O(1)
- 
#### Hackerrank-ийн амжилтын screenshot:
![Screenshot 2025-06-10 142916](https://github.com/user-attachments/assets/0fefbc9f-32bb-4bb6-8f6f-58d6adfae93f)
