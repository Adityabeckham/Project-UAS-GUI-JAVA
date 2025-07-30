# 🚒 Sinaran Damkar - Aplikasi Sistem Pemadam Kebakaran

**Sinaran Damkar** adalah aplikasi berbasis Java Swing yang dibuat untuk membantu pengelolaan laporan kebakaran, pengaturan regu pemadam, dan monitoring armada pemadam kebakaran. Proyek ini merupakan bagian dari UAS (Tugas Akhir Semester) dalam mata kuliah Algoritma dan Pemrograman 2.

## 📌 Fitur Utama

- **Dashboard**
  - Menampilkan ringkasan laporan harian, jumlah armada siaga, dan total laporan kebakaran.
    <img width="1250" height="864" alt="Screenshot 2025-07-30 134005" src="https://github.com/user-attachments/assets/e794e74b-c3fb-4d54-8c7e-10bd68946199" />

  
- **Menu Laporan**
  - Melihat laporan kebakaran masuk.
  - Memproses laporan (penugasan regu).
  - Menyelesaikan laporan (update status).
  <img width="1313" height="834" alt="Screenshot 2025-07-30 135007" src="https://github.com/user-attachments/assets/4ff7b8d1-fc34-4f1d-bd28-1698bc5d4bb7" />

- **Formulir Pelapor**
  - Digunakan untuk menginput data pelapor dan lokasi kejadian kebakaran.
    <img width="595" height="846" alt="Screenshot 2025-07-30 134951" src="https://github.com/user-attachments/assets/8dfa703c-6844-46ec-bb8f-47190a3c9332" />

  
- **Menu Armada **
  -Menampilkan detail armada
<img width="813" height="362" alt="Screenshot 2025-07-30 134938" src="https://github.com/user-attachments/assets/0bd869a1-a965-4522-9058-0ab0e0ec99e6" />

 - **Menu Regu **
   - Menampilkan data regu yang tersedia.
   - Melihat detail regu dan statusnya. 
<img width="813" height="362" alt="Screenshot 2025-07-30 134938" src="https://github.com/user-attachments/assets/ef4bd35d-10e1-430f-8f7c-c06968a10bc2" />

  - **Proses Laporan **
   <img width="1040" height="562" alt="Screenshot 2025-07-30 135024" src="https://github.com/user-attachments/assets/82c02039-327b-444b-be89-57549ff0462f" />

.

🛠 Teknologi yang Digunakan
Java Swing – Untuk membangun antarmuka pengguna grafis (GUI).

ArrayList – Untuk menyimpan data laporan, regu, dan pelapor secara dinamis.

OOP (Object-Oriented Programming) – Pendekatan berbasis objek untuk manajemen data.

Library flatlaf-demo-3.6.1.java




## 🗂 Struktur File

| File Java             | Deskripsi                                                               |
|----------------------|-------------------------------------------------------------------------|
| `Damkar02.java`       | Entry point (main class) aplikasi dan inisialisasi frame utama.         |
| `Dashboard.java`      | Tampilan utama aplikasi (dashboard) dengan ringkasan data.             |
| `Menu_laporan2.java`  | Tampilan daftar laporan kebakaran, dan fitur proses & selesai laporan. |
| `Proses_laporan.java` | Form untuk memproses laporan dan memilih regu pemadam.                 |
| `Detail_regu.java`    | Menampilkan informasi detail tentang regu pemadam tertentu.            |
| `Menu_armada.java`    | Menampilkan daftar armada dan regu pemadam kebakaran.                  |
| `Form_pelapor.java`   | Form input untuk membuat laporan kebakaran oleh pelapor.               |

## 🚀 Cara Menjalankan Aplikasi

1. Pastikan Java telah terinstal (Java JDK 8 atau lebih baru).
2. Clone repository ini:
   ```bash
   git clone https://github.com/Adityabeckham/Project-UAS-GUI-JAVA.git
