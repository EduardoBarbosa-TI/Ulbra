import { Avatar } from "./Avatar";

export function Profile({data}) {
    return (
        <div>
            <p>{data.name}</p>
            <Avatar urlImg={data.urlImg}/>
            <ul>
                <li>Profession: {data.profession}</li>
                <li>Awards: {data.awards}</li>
                <li>Discovered: {data.discovered}</li>
            </ul>
    
        </div>
    )
}