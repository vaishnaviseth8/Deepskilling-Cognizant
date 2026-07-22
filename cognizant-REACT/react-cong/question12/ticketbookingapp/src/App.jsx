import { useState } from "react";

import Greeting from "./components/Greeting";
import LoginButton from "./components/LoginButton";
import LogoutButton from "./components/LogoutButton";

import "./App.css";

function App(){

    const [isLoggedIn,setIsLoggedIn]=useState(false);

    const handleLogin=()=>{

        setIsLoggedIn(true);

    };

    const handleLogout=()=>{

        setIsLoggedIn(false);

    };

    let button;

    if(isLoggedIn){

        button=<LogoutButton onClick={handleLogout}/>;

    }

    else{

        button=<LoginButton onClick={handleLogin}/>;

    }

    return(

        <div>

            <Greeting isLoggedIn={isLoggedIn}/>

            {button}

        </div>

    );

}

export default App;