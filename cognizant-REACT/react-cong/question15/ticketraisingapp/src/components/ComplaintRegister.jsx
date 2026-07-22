import React from "react";

class ComplaintRegister extends React.Component {

    constructor() {

        super();

        this.state = {

            name: "",
            complaint: "",
            referenceNumber: 0

        };

    }

    handleChange = (event) => {

        this.setState({

            [event.target.name]: event.target.value

        });

    }

    handleSubmit = (event) => {

        event.preventDefault();

        const ref = Math.floor(Math.random() * 100) + 1;

        this.setState({

            referenceNumber: ref

        });

        alert(
            "Thanks " +
            this.state.name +
            "\nYour Complaint was Submitted." +
            "\nReference ID is: " +
            ref
        );

    }

    render() {

        return (

            <div className="container">

                <h1>Register your complaints here!!!</h1>

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

                                <td>Complaint:</td>

                                <td>

                                    <textarea
                                        name="complaint"
                                        value={this.state.complaint}
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

export default ComplaintRegister;