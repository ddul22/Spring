function read(){
  fetch('http://localhost:8081/board/7/replies?page=1')
  .then((response) => response.json())
  .then((json) => console.log(json));
}

function register(){
  fetch('http://localhost:8081/board/7/replies', {
    method: 'POST',
    body: ({
      reply: '파이팅',
      replyer: '파이팅'
    }),
 
  })
    .then((response) => response.json())
    .then((json) => console.log(json));
}

function register2(){
  fetch('http://localhost:8081/board/7/replies', {
    method: 'POST',
    body: "reply=xxxx&replyer=yyyyy",
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded',
    }
  })
    .then((response) => response.json())
    .then((json) => console.log(json));
}
register2();