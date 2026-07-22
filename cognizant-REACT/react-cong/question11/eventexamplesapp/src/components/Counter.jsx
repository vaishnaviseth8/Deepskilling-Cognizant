import React from "react";

class Counter extends React.Component {

    constructor() {

        super();

        this.state = {

            count:0,
            amount:"",
            currency:""

        };

    }

    increment=()=>{

        this.setState({

            count:this.state.count+1

        });

    }

    decrement=()=>{

        this.setState({

            count:this.state.count-1

        });

    }

    sayHello=()=>{

        alert("Hello! Member");

    }

    sayWelcome=(msg)=>{

        alert(msg);

    }

    onPress=()=>{

        alert("I was clicked");

    }

    multipleMethods=()=>{

        this.increment();

        this.sayHello();

    }

    render(){

        return(

            <div>

                <h3>{this.state.count}</h3>

                <button onClick={this.multipleMethods}>
                    Increment
                </button>

                <br/>

                <button onClick={this.decrement}>
                    Decrement
                </button>

                <br/>

                <button onClick={()=>this.sayWelcome("Welcome")}>
                    Say Welcome
                </button>

                <br/>

                <button onClick={this.onPress}>
                    Click on me
                </button>

            </div>

        );

    }

}

export default Counter;