import React from "react";

class Getuser extends React.Component {

    constructor() {

        super();

        this.state = {

            person: {},
            loading: true

        };

    }

    async componentDidMount() {

        const url = "https://api.randomuser.me/";

        const response = await fetch(url);

        const data = await response.json();

        this.setState({

            person: data.results[0],
            loading: false

        });

    }

    render() {

        if (this.state.loading) {

            return <h2>Loading...</h2>;

        }

        return (

            <div>

                <h1>

                    {this.state.person.name.title}
                    {" "}
                    {this.state.person.name.first}
                    {" "}
                    {this.state.person.name.last}

                </h1>

                <img

                    src={this.state.person.picture.large}

                    alt="User"

                />

            </div>

        );

    }

}

export default Getuser;