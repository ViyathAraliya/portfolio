import { useState } from "react";
import axios from "axios";

function Home() {

    const [name, setName] = useState("");
    const [nameStatus, setNameStatus] = useState("");


    const data = [{ "name": "road map", "author": "araliya" }];

    const [book, setBook] = useState("non");

    function handleBook() {
        axios.get("http://localhost:8080/books")
        .then(function (response) {
            setBook(response.data);
            console.log(response);
        })
        .catch(function (error) {
            console.log(error);
        });
    }


    function handleName(event) {
        setName(event.target.value);
    }



    const homeStyle = {
        maxWidth: "4200px",
        marginTop: "0px",
        //backgroundImage:'url(src/assets/images/sascha-eremin-DNQ-M93tHmA-unsplash.jpg)'
    }
    const headingStyle = {
        color: "red"
    }

    return (<>
        <div className="home"
            style={homeStyle}>
           
            <h2>{book.id}</h2>
            <button onClick={handleBook}>getBook</button>
            <h1 className="homeHeading" style={headingStyle} >
                Browse your favourite genres
            </h1>
            <form>
                <input onChange={handleName}></input>
                <button onClick={handleName}>search</button>
            </form></div>
        <div className="popular">
            <h2>most popular</h2>
        </div></>

    );

}
export default Home