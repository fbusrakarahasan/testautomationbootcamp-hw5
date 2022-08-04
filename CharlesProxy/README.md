<h1 align="center"> :bookmark_tabs: Enuygun - Test Automation Bootcamp - HW5_3 </h1>
 

> ##  ```Charles Proxy araştırınız.  ```

**Charles Proxy Nedir ?**
--- 
<p align="center">
  <img src="https://user-images.githubusercontent.com/102550569/182816368-7b41ebf3-7c1a-4b7d-ab2a-51c66421418b.png" width="800" height="250" />
</p>
  
Charles Proxy, ağ aramalarını izleyen ve web trafiğinin şifresini çözen bir web hata ayıklama aracıdır. Ağ aramanızdaki içeriği anlamanıza yardımcı olur. Sunucuya gönderilen istekler ve sunucudan alınan veriler vb. örnek olarak verilebilir. Bu uygulama Windows, Mac OS, Linux gibi işletim sistemlerini ve Internet Explorer, Chrome, Mozilla Firefox ve Safari gibi tarayıcıları desteklemektedir.

Farklı bir deyişle Charles Web Debugging Proxy, Java ile yazılmış, platformlar arası bir HTTP/HTTPS hata ayıklama proxy sunucusu uygulamasıdır. Mobil veya Web tarayıcısının internet’e Charles üzerinden erişecek şekilde yapılandırılır ve daha sonra gönderilen ve alınan tüm verileri sizin için kaydedebilir ve görüntüleyebilir.
 

Charles Proxy hata ayıklama uygulaması test mühendisleri açısından büyük önem taşımaktadır. Öncelikle kullanım kolaylığı ve zamandan tasarruf sağlaması yönleriyle faydalı bir araçtır. 
Test mühendislerinin normal koşullarda web iletişimlerinde istek ve yanıtları görmesi pek mümkün değildir ancak Charles Proxy sayesinde bu durumu avantaja çevirebilmektedirler.Bu sayede sorunlar hızlıca teşhis edilip düzeltilebilmektedir. 
Aynı zamanda sorunun nerede olduğunun tespit edilmesi ve sorun hakkında detaylı bilgiye ulaşılması test mühendisinin sorunun nasıl çözüleceği ve sorunun hangi birim ile ilgili olduğunu kavraması açısından önem taşımaktadır. 

Charles Proxy’nin test için önem arz eden farklı birçok işlevi de bulunmaktadır. Bu işlevlere SSL Proxying, Bandwith Throttling(bantgenişliği azaltma), AJAX debugging(hata ayıklama) vb örnek olarak verilebilir. 


> ### Charles Kurulum Nasıl Yapılır?
---
Charles’ı [```https://www.charlesproxy.com/download/```](https://www.charlesproxy.com/download/) adresinden işletim sistemimize göre charles'i indiriyoruz.
 

<img src="https://user-images.githubusercontent.com/102550569/182930946-628f9a5e-9193-446d-a357-40caeeafbd26.png" /> 


İleri diyip gerekli lisans sözleşmelerini kabul edip kurulumunu tamamlıyoruz. Ve açtığımızda bizi aşağıdaki gibi bir ekran karşılıyor.

![charles](https://user-images.githubusercontent.com/102550569/182931822-f7fd9dc6-cbd2-4c0b-9293-b850e400786b.png)


Peki mobil cihazlarla nasıl bağlantı kurulur? 

1. Charles üzerinden SSL Proxy Settings üzerinden Host ve Port’u ayarlamak

2. Bilgisayarımızı ve telefonumuzu "Aynı kablosuz ağa bağlamak"

3. Bilgisayarımızda görünen IP adresi ve Port numarasını telefona proxy olarak eklemek

4. Ardından iOS için safariden https://chls.pro/ssl adresinden SSL sertifikasını indirmek

5. Telefon ayarlarından "SSL sertifikasına güven" diyerek doğrulamak
---

> #### Charles Üzerinden Host ve Portu Ayarlamak

Proxy ayarlarından “SSL Proxy Settings” kısmına giriyoruz.

![1](https://user-images.githubusercontent.com/102550569/182932619-ffaa35c2-9beb-4008-9f9f-a806f187cce0.png)

SSL Proxying sekmesinden "Add" diyerek Host ve Portumuzu giriyoruz. 

![2](https://user-images.githubusercontent.com/102550569/182932779-5506754f-5687-4c54-9dcc-f3469fd89828.png)

> #### Aynı kablosuz ağa bağlamak ve bilgisayarımızda görünen IP adresi ve Port numarasını telefona proxy olarak eklemek

Port numarasını ise Charles üzerinden değiştirebilir ve görebilirsiniz. Proxy ayarlarından Proxy Settings’e tıklıyoruz. Port numarası Default olarak 8888 olarak geliyor.

![3](https://user-images.githubusercontent.com/102550569/182933668-492c9194-8eba-4ede-959a-11fda3aa5063.png)

![4](https://user-images.githubusercontent.com/102550569/182933751-151634bc-51c1-4729-8ab8-2e0126c323bd.png)
 
Ardından telefonumuzun Proxy ayarlarını giriyoruz. Kablosuz Ağımızın ayarlarından "Proxy’yi ayarla" diyoruz. Bağlantınız tamamlandı!

> #### SSL Sertifika Nedir ve Nasıl Kurulur?

SSL sertifikası normalde gelen ve giden trafiği doğruladığı için bu araya sertifika girdiği zaman sahte bir sertifika yaratıyor ve onun üzerinden trafiği sağlıyor. Bu şekilde trafiği dinleyebiliyor hale geliyor.
 
SSL Sertifikasını kurmadan sağlıklı veriler alamayız. Telefondan Safari'ye Girip SSL Sertifikasını kuruyoruz.

https://chls.pro/ssl adresine gidelim.

Buradan "izin ver" diyoruz. "Profil indirildi" yazısını gördüğümüzde işlem tamamdır. Daha sonrasında ayarlardan "SSL sertifikasına güven" diyerek doğrulayabilirsiniz.


Buraya kadar geldiğinizde Charles açıkken uygulamayı açtığımızda, Charles’tan bir uyarı gelecektir: "Bu adresten veri geliyor onaylıyor musunuz?" gibi. Allow ‘u tıklıyoruz.

Tebrikler. Bilgisayarınız ve Test cihazınız arasında Charles Proxy bağlantınızı başarılı bir şekilde gerçekleştirmiş oldunuz. 😊
