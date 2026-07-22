import {useEffect,useState} from 'react';
export default function App(){
 const [msg,setMsg]=useState("Loading...");
 useEffect(()=>{
   fetch("http://localhost:8080/api/message")
   .then(r=>r.text())
   .then(setMsg)
   .catch(()=>setMsg("Welcome to the first session of React"));
 },[]);
 return <div style={{textAlign:'center',marginTop:'60px'}}><h1>{msg}</h1></div>;
}
