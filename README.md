# http2 server입니다.
- 환경: openjdk-14, Tomcat/9.0.37
- JDK 8 이하이거나 Tomcat이 8이하일 경우 별도의 라이브러리[libtcnative library] 설치후 의존성을 주입이 필요합니다.
- 브라우저에서는 ssl로 요청해야합니다.
- example: 
   - http2: https://localhost:8443//http2-server/{version}
   - http1.1: http://localhost:8070//http2-server/{version}
- 참조
   - http://wiki.gurubee.net/pages/viewpage.action?pageId=3902222
   - https://digitalbourgeois.tistory.com/67
