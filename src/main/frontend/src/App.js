import React, { useEffect, useState } from "react";
import axios from "axios";

function App() {

  const [hello, setHello] = useState("");
  const [person, setPerson] = useState({});

  useEffect(() => {
    axios
      .get("/api/hello")
      .then((response) => setHello(response.data))
      .catch((error) => console.log(error));
  }, []);

  useEffect(() => {
    axios
        .get("/api/person")
        .then((response) => setPerson(response.data))
        .catch((error) => console.log(error));
  }, []);

  return <div><p>
    백엔드에서 가져온 데이터입니다 : {hello}
  </p>
  <p>Person의 나이 : {person.age}</p></div>;
}

export default App;
