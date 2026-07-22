import {useEffect,useState} from 'react';
import {getMessage} from '../services/api';
export default function About(){
const [msg,setMsg]=useState("Loading...");
useEffect(()=>{getMessage("about").then(setMsg);},[]);
return <h2>{msg}</h2>;
}