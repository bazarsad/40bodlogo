## Бодлого-13
Бодлогын нэр: Encryption

🔗 Hackerrank холбоос: https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true

#### Бодлогын өгөгдөл:
Өгөгдсөн string s дээр шифрлэлт хийх шаардлагатай. Үсэг, тоо, тэмдэгтүүдийн хоорондын хоосон зайнуудыг арилгаж, дараа нь тодорхой хэмжээтэй grid хэлбэрт оруулж шифрлэнэ.

Алгоритм:

Хоосон зайнуудыг арилгана.
- rows ба columns-ыг sqrt(s.length) дээр үндэслэн тодорхойлно:
-- rows = floor(sqrt(L))
-- columns = ceil(sqrt(L))
- Хэрвээ rows * columns < L байвал rows++
- Үүссэн grid-ийн багануудаар уншиж шифрлэгдсэн текст үүсгэнэ.

####  Шийдэл
Бүх текстийг нэг мөрөнд оруулж, 2D grid-д тааруулан байрлуулна. Дараа нь баганаар уншин шифрлэсэн текстийг үүсгэнэ. Энэ аргаар текстийг шифрлэж, амархан буцааж тайлж болдог бүтэц бий болдог.

Grid-н логик нь дараах байдлаар ажиллана:
- Эхлээд мөрөөр бичнэ: жишээ нь "haveaniceday" have anic eday
- Дараа нь баганаар уншина: "hae and via ecy"

#### Hackerrank-ийн амжилтын screenshot:
![Screenshot 2025-06-10 131129](https://github.com/user-attachments/assets/75dd48c7-5e04-4f35-941b-1d56a8979404)
