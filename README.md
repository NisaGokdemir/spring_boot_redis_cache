# Spring Boot ve Redis ile Önbellekleme Uygulaması

Bu proje, **Spring Boot** kullanarak **Redis** ile önbellekleme (caching) işlemlerinin nasıl entegre edileceğini gösteren bir örnektir. Redis, yüksek performanslı bir bellek içi veri yapısı deposudur ve uygulamalarda veri erişim hızını artırmak için sıklıkla önbellek olarak kullanılır.

## 🛠️ Kullanılan Teknolojiler

- **Spring Boot**
- **Spring Data Redis**
- **Docker**
- **Docker Compose**

## 🚀 Başlangıç

### Kurulum ve Çalıştırma

1. **Depoyu Klonlayın:**

   ```bash
   git clone https://github.com/NisaGokdemir/spring_boot_redis_cache.git
   cd spring_boot_redis_cache

2. **Docker ve Docker Compose ile Uygulamayı Başlatın:**

   ```bash
   docker-compose up --build
   
Bu komut, hem uygulamayı hem de Redis sunucusunu Docker konteynerlarında başlatacaktır.

3. **Uygulamayı Test Edin:**

Uygulama varsayılan olarak **http://localhost:8080** adresinde çalışacaktır. Postman veya benzeri bir araç kullanarak API'yi test edebilirsiniz.
