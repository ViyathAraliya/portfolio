import { useState } from "react";

function Home() {

   const [name,setName]=useState("");
   const [nameStatus, setNameStatus]=useState("");

   function handleName(event){
    setName(event.target.value);
   }


  
    const homeStyle={
       maxWidth:"4200px",
       marginTop: "0px",
        //backgroundImage:'url(src/assets/images/sascha-eremin-DNQ-M93tHmA-unsplash.jpg)'
    }
    const headingStyle={
        color : "red"
    }

    return (
    <div className="home" 
    style={homeStyle}>
        <h2>{name}</h2>
        <h1 className="homeHeading" style={headingStyle} >
        Browse your favourite genres
    </h1>
    <form>
    <input onChange={handleName}></input>
    <button onClick={handleName}>show Name</button>
    </form></div>);

}
export default Home