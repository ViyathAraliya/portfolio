import react,{ useEffect, useState } from "react";
import axios from "axios";
import 'bootstrap/dist/css/bootstrap.css';



function Home() {
    const [books, setBooks] = useState([]);

    useEffect(() => {
        
        axios.get("http://localhost:8080/loadBooks")
            .then(function (response) {
                setBooks(response.data)
                console.log(response.data)
            }).catch(function (error) {
                console.log(error)
            })

    },
        []//leave black to run at page load only, or else set state otr triggers
    )





    return (<>
        <div className="container">
            
           
                <div>
                <h2 className="text-muted">Books</h2>

                
                    
                       <table className="table table-striped">
                        <thead>
                            <tr>
                                <th>Title</th>
                                <th>Author</th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                        {books && books.map((book)=>(
                            <tr key={book.id}>
                                <td>{book.name}</td>
                                <td>{book.author}</td>
                                <td>{book.price}</td>
                                <td><button className="btn btn-primary"
                                onClick={(event)=>{
                                    event.preventDefault();
                                    console.log(77777);
                                }}>add to cart</button></td>
                            </tr>
                        ))}
                        </tbody>
                       </table>
       
                
            </div>
            <div className="text-muted">
                <p >"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."</p>
            </div>
        </div>

    </>

    );

}
export default Home