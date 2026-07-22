import React from "react";

class Register extends React.Component {

    constructor() {

        super();

        this.state = {

            name: "",
            email: "",
            password: ""

        };

    }

    handleChange = (event) => {

        this.setState({

            [event.target.name]: event.target.value

        });

    }

    handleSubmit = (event) => {

        event.preventDefault();

        const { name, email, password } = this.state;

        if (name.length < 5) {

            alert("Name should have at least 5 characters");

            return;

        }

        if (!email.includes("@") || !email.includes(".")) {

            alert("Invalid Email");

            return;

        }

        if (password.length < 8) {

            alert("Password should have at least 8 characters");

            return;

        }

        alert("Registration Successful");

    }

    render() {

        return (

            <div className="container">

                <h1>Register Here!!!</h1>

                <form onSubmit={this.handleSubmit}>

                    <table>

                        <tbody>

                            <tr>

                                <td>Name:</td>

                                <td>

                                    <input
                                        type="text"
                                        name="name"
                                        value={this.state.name}
                                        onChange={this.handleChange}
                                    />

                                </td>

                            </tr>

                            <tr>

                                <td>Email:</td>

                                <td>

                                    <input
                                        type="email"
                                        name="email"
                                        value={this.state.email}
                                        onChange={this.handleChange}
                                    />

                                </td>

                            </tr>

                            <tr>

                                <td>Password:</td>

                                <td>

                                    <input
                                        type="password"
                                        name="password"
                                        value={this.state.password}
                                        onChange={this.handleChange}
                                    />

                                </td>

                            </tr>

                            <tr>

                                <td></td>

                                <td>

                                    <button type="submit">

                                        Submit

                                    </button>

                                </td>

                            </tr>

                        </tbody>

                    </table>

                </form>

            </div>

        );

    }

}

export default Register;