import {useEffect,useState} from 'react';
import {getMessage} from '../services/api';
export default function Contact(){
const [msg,setMsg]=useState("Loading...");
useEffect(()=>{getMessage("contact").then(setMsg);},[]);
return <h2>{msg}</h2>;
}