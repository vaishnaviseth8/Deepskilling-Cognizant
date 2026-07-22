import {useEffect,useState} from 'react';
import {getMessage} from '../services/api';
export default function Home(){
const [msg,setMsg]=useState("Loading...");
useEffect(()=>{getMessage("home").then(setMsg);},[]);
return <h2>{msg}</h2>;
}