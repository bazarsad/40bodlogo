## Бодлого-30
Бодлогын нэр: Queue using two stacks

🔗 Hackerrank холбоос: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem?isFullScreen=true

#### Бодлогын өгөгдөл:
Хоёр стек ашиглан дараалал (queue) бүтцийг хэрэгжүүлэх бодлого. Stack нь LIFO (Last In First Out) зарчмаар ажилладаг бол queue нь FIFO (First In First Out) зарчмаар ажилладаг.

#### Алгоритм
Хоёр стек ашиглах арга:
- Stack1: enqueue үйлдэлд ашиглана
- Stack2: dequeue, front үйлдэлд ашиглана
- Stack2 хоосон бол Stack1-ээс бүх элементийг Stack2 руу шилжүүлнэ
- Цаг хугацааны нарийвчлал: O(1) amortized

#### Hackerrank-ийн амжилтын screenshot:
![Screenshot 2025-06-10 152126](https://github.com/user-attachments/assets/8b8c0571-0f4d-499e-bf43-ffed9354152d)
