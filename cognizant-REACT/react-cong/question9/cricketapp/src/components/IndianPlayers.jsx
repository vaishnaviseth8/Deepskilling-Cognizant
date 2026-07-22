function OddPlayers({ IndianTeam }) {

    const [first, , third, , fifth] = IndianTeam;

    return (
        <div>
            <ul>
                <li>First : {first}</li>
                <li>Third : {third}</li>
                <li>Fifth : {fifth}</li>
            </ul>
        </div>
    );
}

function EvenPlayers({ IndianTeam }) {

    const [, second, , fourth, , sixth] = IndianTeam;

    return (
        <div>
            <ul>
                <li>Second : {second}</li>
                <li>Fourth : {fourth}</li>
                <li>Sixth : {sixth}</li>
            </ul>
        </div>
    );
}

function ListofIndianPlayers({ IndianPlayers }) {

    return (
        <ul>
            {IndianPlayers.map((player, index) => (
                <li key={index}>Mr. {player}</li>
            ))}
        </ul>
    );
}

function IndianPlayers() {

    const IndianTeam = [
        "Sachin",
        "Dhoni",
        "Virat",
        "Rohit",
        "Yuvraj",
        "Raina"
    ];

    const T20Players = [
        "First Player",
        "Second Player",
        "Third Player"
    ];

    const RanjiPlayers = [
        "Fourth Player",
        "Fifth Player",
        "Sixth Player"
    ];

    const IndianPlayers = [
        ...T20Players,
        ...RanjiPlayers
    ];

    return (

        <div>

            <h1>Odd Players</h1>

            <OddPlayers IndianTeam={IndianTeam} />

            <hr />

            <h1>Even Players</h1>

            <EvenPlayers IndianTeam={IndianTeam} />

            <hr />

            <h1>List of Indian Players Merged:</h1>

            <ListofIndianPlayers IndianPlayers={IndianPlayers} />

        </div>

    );
}

export default IndianPlayers;