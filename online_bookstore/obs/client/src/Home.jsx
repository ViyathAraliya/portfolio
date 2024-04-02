import { useEffect, useState } from "react";
import axios from "axios";
import 'bootstrap/dist/css/bootstrap.css';



function Home() {
    const [books, setBooks] = useState([]);
   const [cart,setCart]=useState([]);
   const[ha,setHa]=useState("");
   
   
   
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
                                onClick={()=>{
                                    
                                    let cartImg=cart;
                                    
                                    cartImg.push({
                                       book
                                    });
                                    let cartImg2=[...cartImg]
                                   setCart(cartImg2);
                                }}>add to cart</button></td>
                            </tr>
                        ))}
                        </tbody>
                       </table>
            </div>
            
            <div>
                
                <label> total items : {cart.length} </label>
            </div>
            
        </div>

    </>

    );

}
export default Home